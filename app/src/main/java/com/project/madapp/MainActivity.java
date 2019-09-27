package com.project.madapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
     button button;
     textView textView;
     button2 button2;
     button3 button3;
     button4 button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewID(r.id.textLMS);
        button = findViewByID(r.id.Bone);
        button2 = findViewByID(r.id.Btwo);
        button3 = findViewByID(r.id.Bthree);
        button4 = findViewByID(r.id.Bfour);

        button.setOnClickListener(new View.onClickListener() {
         public void onClick(View v) {
         }
        }
        }


    }
}
