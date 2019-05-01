package com.jnova.windowsffcoach;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.jnova.windowsffcoach.models.Team;

import java.util.ArrayList;
import java.util.List;

public class MyrecyclerTeams extends RecyclerView.Adapter<MyrecyclerTeams.ViewHolder> {

    private List<Team> mTeam;

    public MyrecyclerTeams(List<Team> teams){
        mTeam= teams;
    }


    @Override
    public MyrecyclerTeams.ViewHolder onCreateViewHolder( ViewGroup viewGroup, int viewType) {

        Context context= viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.recycler_teams,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyrecyclerTeams.ViewHolder viewHolder, int i) {
        Team team = mTeam.get(i);

        TextView textView = viewHolder.nameTeamTextview;
        textView.setText(team.getnName());
        ImageView imgv = viewHolder.imageselected;
        //imgv.setVisibility(team.);
    }

    @Override
    public int getItemCount() {
        return mTeam.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTeamTextview;
        public ImageView imageselected;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTeamTextview =(TextView) itemView.findViewById(R.id.team_name);
            imageselected = (ImageView) itemView.findViewById(R.id.selected);
        }
    }
}
