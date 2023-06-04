package com.example.sharedperferencesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNext = findViewById(R.id.next_activity);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

        if(DataLocalManager.getFirstIntalled() == false){
            Toast.makeText(this, "cài đặt lần đầu tiên", Toast.LENGTH_SHORT).show();
            DataLocalManager.setFirstInstalled(true);
        }

        Set<String> name = new HashSet<>();
        name.add("BaoLe");
        name.add("BaoLe2");
        name.add("BaoLe3");
        DataLocalManager.setArrayName(name);


    }
}