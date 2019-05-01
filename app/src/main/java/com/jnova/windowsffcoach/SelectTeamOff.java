package com.jnova.windowsffcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jnova.windowsffcoach.R;

public class SelectTeamOff extends AppCompatActivity {
    Button btnoff;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_game_team_offense);

        btnoff = findViewById(R.id.buttonoff);

        btnoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectTeamOff.this,SelectTeamDef.class));
            }
        });
    }
}
