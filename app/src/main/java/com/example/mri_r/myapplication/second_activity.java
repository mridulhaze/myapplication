package com.example.mri_r.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by mri_r on 20-Jan-17.
 */
public class second_activity extends Activity{

    Button b2;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main2);

        b2 = (Button)findViewById(R.id.button2);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mynew = new Intent(v.getContext(),MainActivity.class);
                startActivity(mynew);
            }
        });


    }


}
