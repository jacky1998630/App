package com.project.madapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewByID(r.id.one);
        button2 = findViewByID(r.id.two);
        button3 = findViewByID(r.id.three);
        button4 = findViewByID(r.id.four);


    }
}
