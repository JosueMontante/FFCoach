package com.jnova.windowsffcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.jnova.windowsffcoach.models.Team;

import java.util.ArrayList;

public class SelectTeamActivity extends AppCompatActivity   {
    Button btn;
    ArrayList<Team> teams;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_team);

        RecyclerView rvTeams = findViewById(R.id.recycler_team);
        btn = findViewById(R.id.btn_selectteam);
        teams = Team.createteamlist(6);
        MyrecyclerTeams adapter = new MyrecyclerTeams(teams);

        rvTeams.setAdapter(adapter);
        rvTeams.setLayoutManager(new LinearLayoutManager(this));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectTeamActivity.this, SelectTeamOff.class));
            }
        });
    }
}
