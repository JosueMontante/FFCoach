package com.jnova.windowsffcoach.models;

import com.jnova.windowsffcoach.R;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public Team(String nName) {
        this.nName = nName;
    }

    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    private String nName;

    public String getNumberofplayers() {
        return numberofplayers;
    }

    public void setNumberofplayers(String numberofplayers) {
        this.numberofplayers = numberofplayers;
    }

    private String numberofplayers;
    private static int lastteamid=0;

    public static ArrayList<Team> createteamlist(int numPlayers){
        ArrayList<Team> teams = new ArrayList<Team>();
        for (int i =1 ;i<numPlayers;i++){
            teams.add(new Team("Team "+ i));
        }
        return  teams;
    }




}
