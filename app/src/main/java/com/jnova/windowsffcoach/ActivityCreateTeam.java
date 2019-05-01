package com.jnova.windowsffcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityCreateTeam extends AppCompatActivity {
    Button addplayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createteam);


        addplayer = findViewById(R.id.button20);
        addplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityCreateTeam.this,ActivityCreateplayer.class));
            }
        });
    }
}
