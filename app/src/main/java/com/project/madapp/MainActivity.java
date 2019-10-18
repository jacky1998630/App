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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Bone = findViewById(R.id.Bone);
        Button Btwo = findViewById(R.id.Btwo);
        Button Bthree = findViewById(R.id.Bthree);
        Button Bfour = findViewById(R.id.Bfour);
        Button button = findViewById(R.id.todo);
        Button btnMove = findViewById(R.id.btn1);
        subChange = findViewById(R.id.Bone);
        subChange = findViewById(R.id.Btwo);
        subChange = findViewById(R.id.Bthree);
        subChange = findViewById(R.id.Bfour);


        subChange.setOnClickListener(new View.OnClickListener() {
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

        Bone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToSubjects();
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

