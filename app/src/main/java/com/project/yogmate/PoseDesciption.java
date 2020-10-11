package com.project.yogmate;

import android.database.Cursor;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

public class PoseDesciption extends AppCompatActivity implements TextToSpeech.OnInitListener {
    DataHelper dataHelper;
    Cursor cursor;
    int pid;
    RecyclerView recyclerView1;
    RecyclerView recyclerView2;
    ImageButton btnSpeak,btnStop;
    int mainid;
    ArrayList<String> steps;
    ArrayList<String> benefits;
    TextToSpeech t1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pose_description);
        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar);
        TextView poseName = findViewById(R.id.poseName);
        TextView description = findViewById(R.id.poseDescription);
        t1  = new TextToSpeech(this, (TextToSpeech.OnInitListener) this);
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
        int i = 1;
        while(cursor.moveToNext()){
            int id = cursor.getInt(1);
            if(id == mainid) {
                steps.add("STEP "+ i+ " : \n" + cursor.getString(2));
                i++;
            }
        }
        MyAdapter myAdapter = new MyAdapter(this,steps);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView1.setLayoutManager(llm);
        recyclerView1.setAdapter(myAdapter);
        i = 1;
        cursor = dataHelper.getData("poseBenefits");
        while(cursor.moveToNext()){
            int id = cursor.getInt(1);
            if(id == mainid) {
                benefits.add("BENEFIT " + i+ ": \n" + cursor.getString(2));
                i++;
            }
        }
        MyAdapter myAdapter1 = new MyAdapter(this,benefits);
        LinearLayoutManager llm1 = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView2.setLayoutManager(llm1);
        recyclerView2.setAdapter(myAdapter1);
        btnSpeak = findViewById(R.id.imageButton2);

        btnSpeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String allSteps = null;
                for(int i = 0; i < steps.size(); i++){
                    allSteps += steps.get(i);
                }
                t1.speak(allSteps, TextToSpeech.QUEUE_ADD, null);
            }
        });
        btnStop = findViewById(R.id.imageButton3);
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onStop();
            }
        });



    }

    @Override
    public void onInit(int status) {
        t1.setLanguage(Locale.US);
    }

    @Override
    protected void onStop() {
        super.onStop();
        t1.stop();
    }
}
