package com.jnova.windowsffcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityPlay extends AppCompatActivity {
    Button dropped, tackled, intercepted, td;
    View pleasework;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);


        intercepted= findViewById(R.id.btn_inter);
        dropped= findViewById(R.id.btn_dropp);
        tackled = findViewById(R.id.btn_tackle);
        td = findViewById(R.id.td);

        intercepted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityPlay.this,ViewGamemotion.class));
                // setVisible();
            }
        });
        dropped.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityPlay.this,ViewGamemotion.class));
            }
        });
        tackled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityPlay.this,ViewGamemotion.class));
            }
        });
        td.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityPlay.this,CreatePlay.class));
            }
        });
    }
}
