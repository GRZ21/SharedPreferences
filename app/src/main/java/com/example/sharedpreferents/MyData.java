package com.example.sharedpreferents;

import android.content.Context;
import android.content.SharedPreferences;


public class MyData {

    public int number;
    private Context context;                //定义Context域
    public MyData(Context context){         //定义有参数的构造函数，参数为Contetx
        this.context = context;
    }


    //以下将name,key defValue放入创建的资源中

    public  void save(){
        String name = context.getResources().getString(R.string.My_Data);
        SharedPreferences x = context.getSharedPreferences(name,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = x.edit();
        String key = context.getResources().getString(R.string.My_Key);
        editor.putInt(key,number);
        editor.apply();
    }

    public int load(){
        String name = context.getResources().getString(R.string.My_Data);
        SharedPreferences x = context.getSharedPreferences(name,Context.MODE_PRIVATE);
        String key = context.getResources().getString(R.string.My_Key);
        int y = x.getInt(key,context.getResources().getInteger(R.integer.defValue));
        number = y;
        return y;
    }
}
