package com.project.madapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.project.madapp.ui.downloads;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button button;
    private Button btnMove;
    private Button subChange;
    private Button subChange2;
    private Button subChange3;
    private Button subChange4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.todo);
        btnMove = findViewById(R.id.btn1);
        subChange = findViewById(R.id.Bone);
        subChange2 = findViewById(R.id.Btwo);
        subChange3 = findViewById(R.id.Bthree);
        subChange4 = findViewById(R.id.Bfour);



        subChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSubjects();
            }
        });

        subChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSubjects();
            }
        });

        subChange3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSubjects();
            }
        });

        subChange4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSubjects();
            }
        });

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToActivtyDownloads();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentasker();
            }
        });


        }
        public void opentasker() {
        Intent intent = new Intent(MainActivity.this, tasker.class);
        startActivity(intent);
        }
         private void moveToActivtyDownloads(){
         Intent intent = new Intent(MainActivity.this, downloads.class);
         startActivity(intent);
         }

         private void  moveToSubjects(){
        Intent intent = new Intent(MainActivity.this, subject.class);
        startActivity(intent);
         }


    @Override
    public void onClick(View view) {

    }

}

