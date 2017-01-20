package com.example.mri_r.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_example);

        t1 = (Button)findViewById(R.id.third);
        t2 = (Button)findViewById(R.id.third1);
        t3 = (Button)findViewById(R.id.third2);

        // calling first page
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent third = new Intent(v.getContext(),MainActivity.class);
                startActivity(third);
            }
        });


        // calling second page
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent third2 = new Intent(v.getContext(),second_activity.class);
                startActivity(third2);


            }
        });

          //calling third page


        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Intent third3 = new Intent(v.getContext(),MainActivity.class);
             //   startActivity(third3);
                Toast.makeText(Main2Activity.this,"This is third activity ",Toast.LENGTH_LONG).show();
            }
        });





    }

}
