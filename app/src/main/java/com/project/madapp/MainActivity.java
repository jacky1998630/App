package com.project.madapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Bone = findViewById(R.id.Bone);
        Button Btwo = findViewById(R.id.Btwo);
        Button Bthree = findViewById(R.id.Bthree);
        Button Bfour = findViewById(R.id.Bfour);

        Bone.setOnClickListener(this);
        Btwo.setOnClickListener(this);
        Bthree.setOnClickListener(this);
        Bfour.setOnClickListener(this);

        }
        }


    @Override
    public void onClick(View view) {

    }
}
}
