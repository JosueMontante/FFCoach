package com.jnova.windowsffcoach;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    private Button login,sigin;
    private TextInputLayout mail, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        login =(Button) findViewById(R.id.sign_in_btn);
        sigin = findViewById(R.id.sign_up_btn);

        sigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,ActivityMainMenu.class));
            }
        });
    }

}
