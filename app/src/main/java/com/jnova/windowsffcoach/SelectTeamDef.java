package com.jnova.windowsffcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SelectTeamDef extends AppCompatActivity {
    Button btndef;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_game_team_defense);

        btndef = findViewById(R.id.buttondef);

        btndef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectTeamDef.this,ActivityGame.class));
            }
        });
    }
}
