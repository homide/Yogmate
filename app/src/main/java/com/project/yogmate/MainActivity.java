package com.project.yogmate;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ViewFlipper viewFlipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar);
        viewFlipper = findViewById(R.id.viewFlipper);

        String imgArr[] = {"https://tableforchange.com/wp-content/uploads/2017/05/yoga-quotes-5-min.png","https://tableforchange.com/wp-content/uploads/2017/06/yoga-quotes-13-min.png","https://tableforchange.com/wp-content/uploads/2017/06/yoga-quotes-11-min.png"
        ,"https://tableforchange.com/wp-content/uploads/2017/06/yoga-quotes-10-min.png","https://tableforchange.com/wp-content/uploads/2017/05/yoga-quotes-6-min.png","https://tableforchange.com/wp-content/uploads/2017/06/yoga-quotes-9-min.png"};


        viewFlipper = findViewById(R.id.viewFlipper);
        for(int i=0;i<imgArr.length;i++) {
            setFlipperImage(imgArr[i]);
        }

        DataHelper dataHelper = new DataHelper(this);
        Cursor cursor = dataHelper.getData("anatomyList");
        if(cursor.getCount() <=0){
            InsertAnatomyData insertAllData = new InsertAnatomyData(this);
        }

        DataHelper dataHelper1 = new DataHelper(this);
        Cursor cursor1 = dataHelper1.getData("benefitList");
        if(cursor1.getCount() <=0){
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
    private void setFlipperImage(String imgUrl) {
        ImageView image = new ImageView(getApplicationContext());
        Picasso.with(this).load(imgUrl).into(image);
        viewFlipper.addView(image);
    }
}