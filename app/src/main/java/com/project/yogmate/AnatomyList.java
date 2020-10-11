package com.project.yogmate;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AnatomyList extends AppCompatActivity {
    GridView gridView;
    DataHelper dataHelper;
    ArrayList<String> titleArr;
    ArrayList<String> imgLinkArr;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anatomylist);
        gridadapter gd = new gridadapter();
        gridView = findViewById(R.id.anatomyGridview);
        gridView.setAdapter(gd);
        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int pid = position;
                Intent intent = new Intent(AnatomyList.this, PosesForAnatomy.class);
                intent.putExtra("pid",pid);
                startActivity(intent);
            }
        });
    }


    class gridadapter extends BaseAdapter {
        Cursor cursor;

        public gridadapter() {
            dataHelper = new DataHelper(AnatomyList.this);
            cursor = dataHelper.getData("anatomyList");
            titleArr = new ArrayList<>();
            imgLinkArr = new ArrayList<>();
            while (cursor.moveToNext()) {
                String title = cursor.getString(1);
                String link = cursor.getString(2);
                titleArr.add(title);
                imgLinkArr.add(link);
            }
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
            Picasso.with(AnatomyList.this).load(imgLinkArr.get(position)).into(anatomyImage);
            anatomyTitle.setText(titleArr.get(position));
            return convertView;
        }
    }
}

