package com.example.mri_r.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import static com.example.mri_r.myapplication.R.layout.ui_example;

public class MainActivity extends AppCompatActivity  {

    Button b,b1;
    // LinearLayout newview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Hi there : I am mridul", Toast.LENGTH_SHORT).show();



       // newview =  (LinearLayout)findViewById(R.id.layout2);
        b = (Button) findViewById(R.id.button_send);
        b1 = (Button) findViewById(R.id.button_send1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myinteny = new Intent(v.getContext(),Main2Activity.class);
                startActivity(myinteny);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myinteny1 = new Intent(v.getContext(),second_activity.class);
                startActivity(myinteny1);
            }
        });

      //  b.setOnClickListener(newview);
       /*
        if (b != null) {
            b.setOnClickListener();
        }
        */
        // Intent i = new  Intent(MainActivity.this,Main2Activity);


    }


}
