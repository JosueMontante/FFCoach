package com.jnova.windowsffcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityCreateplayer extends AppCompatActivity {
    Button contin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_createplayer);

        contin=findViewById(R.id.button20);

        contin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityCreateplayer.this,ActivityTeamEdit.class));
            }
        });
    }
}
