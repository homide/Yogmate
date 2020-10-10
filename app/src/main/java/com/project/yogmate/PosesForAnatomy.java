package com.project.yogmate;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PosesForAnatomy extends AppCompatActivity {
    DataHelper dataHelper;
    GridView gridView;
    Cursor cursor;
    int pid;
    ArrayList<String> titleArr;
    ArrayList<String> imgLinkArr;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anatomylist);
        TextView textView = findViewById(R.id.anatomyTitle);
        textView.setText("SELECT POSE FOR MORE");
        pid = getIntent().getIntExtra("pid",0);
        gridadapter gd = new gridadapter();
        gridView = findViewById(R.id.anatomyGridview);
        gridView.setAdapter(gd);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int poseid = position;
                Intent intent = new Intent(PosesForAnatomy.this, PoseDesciption.class);
                intent.putExtra("pid", poseid);
                startActivity(intent);
            }
        });
    }

    class gridadapter extends BaseAdapter {

        public gridadapter() {
            dataHelper = new DataHelper(PosesForAnatomy.this);
            cursor = dataHelper.getData("poseListAnatomy");
            titleArr = new ArrayList<>();
            imgLinkArr = new ArrayList<>();
            while (cursor.moveToNext()) {
                int id = cursor.getInt(3);
                if (id == pid) {
                    String title = cursor.getString(1);
                    String link = cursor.getString(2);
                    titleArr.add(title);
                    imgLinkArr.add(link);
                }
            }
        }

        @Override
        public int getCount() {
            return titleArr.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                LayoutInflater inflator = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflator.inflate(R.layout.cardview_list,parent,false);
            }
            ImageView anatomyImage = convertView.findViewById(R.id.folder_image);
            TextView anatomyTitle = convertView.findViewById(R.id.folder_title);
            Picasso.with(PosesForAnatomy.this).load(imgLinkArr.get(position)).into(anatomyImage);
            anatomyTitle.setText(titleArr.get(position));
//            while (cursor.moveToNext()) {
//                int id = cursor.getInt(3);
//                if(id == pid){
//                    String title = cursor.getString(1);
//                    String link = cursor.getString(2);
//                    Picasso.with(PosesForAnatomy.this).load(link).into(anatomyImage);
//                    anatomyTitle.setText(title);
//            }
            return convertView;
        }
    }
}
