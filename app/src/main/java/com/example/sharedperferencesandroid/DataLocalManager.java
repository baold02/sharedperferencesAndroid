package com.example.sharedperferencesandroid;

import android.content.Context;

import java.util.Set;

public class DataLocalManager {
    private static final String FRE_FIRST = "FRE_FIRST";
    private static final String SET_STRING_NAME = "SET_STRING_NAME";
    private static  DataLocalManager instance;
    private  MySharedPerherences mySharedPerherences;

    public static void init(Context context){
        instance = new DataLocalManager();
        instance.mySharedPerherences = new MySharedPerherences(context);
    }

    public static DataLocalManager getInstance(){
        if (instance == null){
            instance = new DataLocalManager();
        }
        return instance;
    }

    public static void setFirstInstalled(boolean isFirst){
        DataLocalManager.getInstance().mySharedPerherences.putBoolenValue(FRE_FIRST,  isFirst);
    }

    public static boolean getFirstIntalled(){
       return DataLocalManager.getInstance().mySharedPerherences.getValue(FRE_FIRST);
    }

    public static void setArrayName(Set<String> name){
        DataLocalManager.getInstance().mySharedPerherences.putStringSetValue(SET_STRING_NAME,  name);
    }

    public static Set<String> getNameUser(){
        return DataLocalManager.getInstance().mySharedPerherences.getStringSetValue(SET_STRING_NAME);
    }

}
