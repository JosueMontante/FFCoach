package com.jnova.windowsffcoach;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jnova.windowsffcoach.files.CardData;
import com.jnova.windowsffcoach.models.CardsModel;

import java.util.ArrayList;

public class Games_team_selected extends AppCompatActivity {
    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private  static RecyclerView recyclerView;
    private static ArrayList<CardsModel> data;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_games);
        recyclerView = findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<CardsModel>();
        for (int i = 0; i < CardData.info.length; i++) {
            data.add(new CardsModel(
                   CardData.info[i]
            ));
        }


        adapter = new CustomAdapter(data);
        recyclerView.setAdapter(adapter);
    }
}
