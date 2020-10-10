package com.project.yogmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataHelper dataHelper = new DataHelper(this);
        Cursor cursor = dataHelper.getData("anatomyList");
        if(cursor.getCount() <=0){
            InsertAnatomyData insertAllData = new InsertAnatomyData(this);
        }

//        try{
//            if(dataHelper.isData("anatomyList")){
//                InsertAnatomyData insertAllData = new InsertAnatomyData(this);
//            }
//        }catch (Exception e){
//            System.out.println("Database not made yet");
//            InsertAnatomyData insertData = new InsertAnatomyData(this);
//        }


        Button anatomybutton = findViewById(R.id.anotomyButton);
        Button benefitButton = findViewById(R.id.benefitButton);
        anatomybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AnatomyList.class);
                startActivity(intent);
            }
        });
        benefitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BenefitList.class);
                startActivity(intent);
            }
        });
    }
}