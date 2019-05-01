package com.jnova.windowsffcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ActivityTeamEdit extends AppCompatActivity {
    Button remove,add,back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teamedit);

        remove = findViewById(R.id.rem);
        add = findViewById(R.id.add);
        back = findViewById(R.id.back);

        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityTeamEdit.this, ActivityRemoveplayer.class));
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityTeamEdit.this,ActivityCreateplayer.class));
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ActivityTeamEdit.this, ActivityMainMenu.class));
            }
        });


    }
}
