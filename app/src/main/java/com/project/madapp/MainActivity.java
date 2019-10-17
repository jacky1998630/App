package com.project.madapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Bone = findViewById(R.id.Bone);
        Button Btwo = findViewById(R.id.Btwo);
        Button Bthree = findViewById(R.id.Bthree);
        Button Bfour = findViewById(R.id.Bfour);
        Button button = findViewById(R.id.todo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentasker();
            }
        });
        button2.setOnClickListener();
        }
        public void opentasker() {
        Intent intent = new Intent(this, tasker.class);
        startActivity(intent);
    }
         public void opendownloadspage(){
         Intent intent = new Intent(this, )
         }


    @Override
    public void onClick(View view) {

    }

}

