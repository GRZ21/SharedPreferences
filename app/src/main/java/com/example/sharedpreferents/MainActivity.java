package com.example.sharedpreferents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {        //数据存储永久保存方式之一：SharedPreferences
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyData myData  = new MyData(getApplicationContext()); //不能使用this,防止内存泄漏
        myData.number = 1000;
        myData.save();
        int z = myData.load();
        String TAG = "myLog";
        Log.d(TAG,"onCreate:"+z);


        //直接在MainActivity中使用SharedPreferences();
        //SharedPreferences x = getPreferences(Context.MODE_PRIVATE); //getPreferences()一般属于MainActivity
       /* SharedPreferences x = getSharedPreferences("new data",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = x.edit();
        editor.putInt("Number",100);
        editor.apply();

        int y = x.getInt("Number",0);
        String TAG = "myLog";
        Log.d(TAG,"onCreate:"+y);
        */


    }


}
