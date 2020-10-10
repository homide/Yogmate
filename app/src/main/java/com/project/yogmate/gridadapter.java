//package com.project.yogmate;
//
//import android.content.Context;
//import android.database.Cursor;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//
//public class gridadapter extends BaseAdapter {
//    Context context;
//    DataHelper dataHelper;
//    Cursor cursor;
//    gridadapter(Context context,String classname){
//        this.context = context;
//        if(classname.equals("AnatomyList")){
//            dataHelper = new DataHelper(context);
//        }
//    }
//    @Override
//    public int getCount() {
//        return cursor.getCount();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return position;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        cursor = dataHelper.getData("anatomyList");
//        while(cursor.moveToNext()){
//
//        }
//        return null;
//    }
//}
