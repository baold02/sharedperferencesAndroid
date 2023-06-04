package com.example.sharedperferencesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.HashSet;
import java.util.Set;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView tvName = findViewById(R.id.tv_name);

        Set<String> strings =   DataLocalManager.getNameUser();
        tvName.setText(strings.toString());

        for (String str : strings){
            tvName.setText(str);
        }

    }
}