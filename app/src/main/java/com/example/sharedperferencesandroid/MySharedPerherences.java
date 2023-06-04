package com.example.sharedperferencesandroid;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.HashSet;
import java.util.Set;

public class MySharedPerherences {
    private static final String MY_SHARED = "MY_SHARED_PERFERENCES";
    private Context context;

    public MySharedPerherences(Context context) {
        this.context = context;
    }

    public void putBoolenValue(String key,boolean val){
        SharedPreferences sharedPreferences = context.getSharedPreferences(MY_SHARED,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key,val);
        editor.apply();
    }

    public boolean getValue(String key){
        SharedPreferences sharedPreferences = context.getSharedPreferences(MY_SHARED,Context.MODE_PRIVATE);
        return  sharedPreferences.getBoolean(key,false);
    }

    public void putStringValue(String key,String val){
        SharedPreferences sharedPreferences = context.getSharedPreferences(MY_SHARED,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key,val);
        editor.apply();
    }

    public String getValue2(String key){
        SharedPreferences sharedPreferences = context.getSharedPreferences(MY_SHARED,Context.MODE_PRIVATE);
        return  sharedPreferences.getString(key,"");
    }

    public void putStringSetValue(String key, Set<String> values){
        SharedPreferences sharedPreferences = context.getSharedPreferences(MY_SHARED,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putStringSet(key,values);
        editor.apply();
    }

    public Set<String> getStringSetValue(String key){
        SharedPreferences sharedPreferences = context.getSharedPreferences(MY_SHARED,Context.MODE_PRIVATE);
        Set<String> valueDefault = new HashSet<>();
        return  sharedPreferences.getStringSet(key,valueDefault);
    }

}
