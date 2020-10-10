package com.project.yogmate;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PoseDesciption extends AppCompatActivity {
    DataHelper dataHelper;
    Cursor cursor;
    int pid;
    RecyclerView recyclerView1;
    RecyclerView recyclerView2;
    int mainid;
    ArrayList<String> steps;
    ArrayList<String> benefits;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pose_description);
        TextView poseName = findViewById(R.id.poseName);
        TextView description = findViewById(R.id.poseDescription);
        ImageView imageView =findViewById(R.id.poseImage);
        pid = getIntent().getIntExtra("pid",0);
        dataHelper = new DataHelper(this);
        cursor = dataHelper.getData("poseDetails");
        recyclerView2 = findViewById(R.id.benefitsView);
        recyclerView1 = findViewById(R.id.stepsView);
        while (cursor.moveToNext()){
            int id = cursor.getInt(1);
            if(pid == id){
                mainid = cursor.getInt(0)-1;
                poseName.setText(cursor.getString(2));
                Picasso.with(this).load(cursor.getString(3)).into(imageView);
                description.setText(cursor.getString(4));
                break;
            }
        }

        cursor = dataHelper.getData("poseSteps");
        steps = new ArrayList<>();
        benefits = new ArrayList<>();
        while(cursor.moveToNext()){
            int id = cursor.getInt(1);
            if(id == mainid) {
                steps.add(cursor.getString(2));
            }
        }
        MyAdapter myAdapter = new MyAdapter(this,steps);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView1.setLayoutManager(llm);
        recyclerView1.setAdapter(myAdapter);

        cursor = dataHelper.getData("poseBenefits");
        while(cursor.moveToNext()){
            int id = cursor.getInt(1);
            if(id == mainid) {
                benefits.add(cursor.getString(2));
            }
        }
        MyAdapter myAdapter1 = new MyAdapter(this,benefits);
        LinearLayoutManager llm1 = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(llm1);
        recyclerView2.setAdapter(myAdapter1);
    }
}
