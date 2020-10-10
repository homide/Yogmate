package com.project.yogmate;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class PosesForAnatomy extends AppCompatActivity {
    DataHelper dataHelper;
    GridView gridView;
    int pid;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anatomylist);
        TextView textView = findViewById(R.id.anatomyTitle);
        textView.setText("SELECT POSE FOR MORE");
        int pid = getIntent().getIntExtra("pid",0);
        gridadapter gd = new gridadapter();
        gridView = findViewById(R.id.anatomyGridview);
        gridView.setAdapter(gd);
    }

    class gridadapter extends BaseAdapter {
        Cursor cursor;

        public gridadapter() {
            dataHelper = new DataHelper(PosesForAnatomy.this);
            cursor = dataHelper.getData("poseListAnatomy");
        }

        @Override
        public int getCount() {
            return cursor.getCount();
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
            while (cursor.moveToNext()) {
                int id = cursor.getInt(3);
                if(id == pid){
                    String title = cursor.getString(1);
                    String link = cursor.getString(2);
                    Picasso.with(PosesForAnatomy.this).load(link).into(anatomyImage);
                    anatomyTitle.setText(title);
                }
            }
            return convertView;
        }
    }
}
