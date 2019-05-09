package com.jnova.windowsffcoach;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.RemoteViews;

public class ActivityGameMotion extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RemoteViews remoteViews = new RemoteViews(getPackageName(),R.layout.view_game_action_pitch);
        remoteViews.setTextViewText(R.id.btn_run, "anything i want");
    }
}
