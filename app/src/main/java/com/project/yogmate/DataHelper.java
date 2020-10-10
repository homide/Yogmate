package com.project.yogmate;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.concurrent.ExecutionException;

public class DataHelper extends SQLiteOpenHelper {
    Context context;
    public static final String DATABASE_NAME = "testing";
    public static final String ANATOMY_LIST = "anatomyList";
    public static final String POSE_LIST_ANATOMY = "poseListAnatomy";
    public static final String POSE_DETAILS = "poseDetails";
    public static final String POSE_BENEFITS = "poseBenefits";
    public static final String POSE_STEPS = "poseSteps";

    public DataHelper(Context context) {
        super(context, DATABASE_NAME,null,6);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS " + ANATOMY_LIST+ "(id INTEGER PRIMARY KEY AUTOINCREMENT, anotomyName TEXT NOT NULL,imgLink TEXT NOT NULL, FOREIGN KEY (id) REFERENCES poseListAnatomy(aid))");
        db.execSQL("CREATE TABLE IF NOT EXISTS " + POSE_LIST_ANATOMY+ "(id INTEGER PRIMARY KEY AUTOINCREMENT, poseName TEXT NOT NULL, imgLink TEXT NOT NULL,aid INTEGER NOT NULL, FOREIGN KEY(id) REFERENCES poseDetails(pid))");
        db.execSQL("CREATE TABLE IF NOT EXISTS " + POSE_DETAILS + "(id INTEGER PRIMARY KEY AUTOINCREMENT, pid INTEGER, poseName TEXT NOT NULL ,imgLink TEXT NOT NULL, poseDesciption TEXT NOT NULL,  FOREIGN KEY (id) REFERENCES poseBenefits(pbid),FOREIGN KEY (id) REFERENCES poseSteps(psd))");
        db.execSQL("CREATE TABLE IF NOT EXISTS " + POSE_BENEFITS + "(id INTEGER PRIMARY KEY AUTOINCREMENT, pbid INTEGER, poseBenefit TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS " + POSE_STEPS+ "(id INTEGER PRIMARY KEY AUTOINCREMENT, psd INTEGER, stepDetail TEXT NOT NULL )");
        System.out.println("tables created");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ANATOMY_LIST);
        db.execSQL("DROP TABLE IF EXISTS " + POSE_LIST_ANATOMY);
        db.execSQL("DROP TABLE IF EXISTS " + POSE_DETAILS);
        db.execSQL("DROP TABLE IF EXISTS " + POSE_BENEFITS);
        db.execSQL("DROP TABLE IF EXISTS " + POSE_STEPS);
        db.execSQL("CREATE TABLE IF NOT EXISTS " + ANATOMY_LIST+ "(id INTEGER PRIMARY KEY AUTOINCREMENT, anotomyName TEXT NOT NULL,imgLink TEXT NOT NULL, FOREIGN KEY (id) REFERENCES poseListAnatomy(aid))");
        db.execSQL("CREATE TABLE IF NOT EXISTS " + POSE_LIST_ANATOMY+ "(id INTEGER PRIMARY KEY AUTOINCREMENT, poseName TEXT NOT NULL, imgLink TEXT NOT NULL,aid INTEGER NOT NULL, FOREIGN KEY(id) REFERENCES poseDetails(pid))");
        db.execSQL("CREATE TABLE IF NOT EXISTS " + POSE_DETAILS + "(id INTEGER PRIMARY KEY AUTOINCREMENT, pid INTEGER, poseName TEXT NOT NULL ,imgLink TEXT NOT NULL, poseDesciption TEXT NOT NULL,  FOREIGN KEY (id) REFERENCES poseBenefits(pbid),FOREIGN KEY (id) REFERENCES poseSteps(psd))");
        db.execSQL("CREATE TABLE IF NOT EXISTS " + POSE_BENEFITS + "(id INTEGER PRIMARY KEY AUTOINCREMENT, pbid INTEGER, poseBenefit TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS " + POSE_STEPS+ "(id INTEGER PRIMARY KEY AUTOINCREMENT, psd INTEGER, stepDetail TEXT NOT NULL )");
        System.out.println("tables created");
    }

    public boolean insertAnatomy(String anatomyName,String imgLink){
        try{
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("anotomyName", anatomyName);
            contentValues.put("imgLink",imgLink);
            long check = db.insert(ANATOMY_LIST,null,contentValues);
            return check!= -1;
        }catch (Exception e){
            System.out.println("Exception in inserting Anatomy");
            return false;
        }
    }

    public boolean insertPose(String poseName,String imgLink,int aid){
        try{
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("poseName",poseName);
            contentValues.put("imgLink",imgLink);
            contentValues.put("aid", aid);
            long check = db.insert(POSE_LIST_ANATOMY,null,contentValues);
            return check!= -1;
        }catch (Exception e){
            System.out.println("Exception in inserting Anatomy pose");
            return false;
        }
    }

    public boolean insertDetails(int pid, String poseName, String imgLink,String poseDescription){
        try{
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("pid", pid);
            contentValues.put("poseName",poseName);
            contentValues.put("imgLink",imgLink);
            contentValues.put("poseDesciption", poseDescription);
            long check = db.insert(POSE_DETAILS,null,contentValues);
            return check != -1;
        }catch (Exception e){
            System.out.println("Exception in insertDetails of Anatomy");
            return false;
        }
    }

    public boolean insertBenefits(int pbid, String poseBenefit){
        try{
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("pbid",pbid);
            contentValues.put("poseBenefit",poseBenefit);
            long check = db.insert(POSE_BENEFITS,null,contentValues);
            return check!= -1;
        }catch (Exception e){
            System.out.println("Exception in inserting benefits in anatomy");
            return false;
        }
    }

    public boolean insertSteps(int psd,String stepDetail){
        try{
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("psd",psd);
            contentValues.put("stepDetail",stepDetail);
            long check = db.insert(POSE_STEPS,null,contentValues);
            return check!= -1;
        }catch (Exception e){
            System.out.println("Exception in inserting steps in Anatomy");
            return false;
        }
    }

    public Cursor getData(String tableName){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM "+tableName,null);
        return res;
    }

    public boolean isData(String tableName){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("SELECT * FROM "+tableName,null);
        if(res.getCount() < 0){
            return true;
        }
        else{
            return false;
        }
    }
}
