package com.jnova.windowsffcoach;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

public class ViewGamemotion extends AppCompatActivity {
    Button run,pitch,trow;
    Layout View;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_game_motion);

        run =findViewById(R.id.btn_run);
        pitch=findViewById(R.id.btn_pitch);
        trow=findViewById(R.id.btn_trow);

        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ViewGamemotion.this,ActivityPlay.class));
               // setVisible();
            }
        });
        pitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ViewGamemotion.this,ActivityPlay.class));
            }
        });
        trow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ViewGamemotion.this,ActivityPlay.class));
            }
        });
    }
}
