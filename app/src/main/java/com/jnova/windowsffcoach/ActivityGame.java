package com.jnova.windowsffcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ActivityGame extends AppCompatActivity  {

    Button gamestart;
    String date_time;
    Calendar calendar;
    SimpleDateFormat simpleDateFormat;
    EditText tv_timer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        gamestart = findViewById(R.id.btnstartplay);

        gamestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityGame.this,ViewGamemotion.class));
            }
        });
    }
}
