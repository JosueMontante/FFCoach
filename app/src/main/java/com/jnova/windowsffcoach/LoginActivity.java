package com.jnova.windowsffcoach;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    private Button login,sigin;
    private EditText mail, password;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    /*    if (auth.getCurrentUser() != null) {
            startActivity(new Intent(LoginActivity.this, ActivityMainMenu.class));
            finish();
        }*/
        setContentView(R.layout.activity_main_login);


        login =(Button) findViewById(R.id.log_in_btn);
        sigin = findViewById(R.id.sign_up_btn);
        mail =  findViewById(R.id.login_email);
        password =  findViewById(R.id.login_pswd);

        auth = FirebaseAuth.getInstance();


        sigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,ActivitySignup.class));
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = mail.getText().toString();
                final String pass = password.getText().toString();

                if (TextUtils.isEmpty(email)){
                    Toast.makeText(getApplicationContext(),"Enter Email",Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(pass)){
                    Toast.makeText(getApplicationContext(),"Enter Password",Toast.LENGTH_LONG).show();
                    return;
                }

                auth.signInWithEmailAndPassword(email,pass)
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (!task.isSuccessful()){
                                    if (pass.length()<6){
                                        password.setError(getString(R.string.minimum_password));
                                    }else {
                                        Toast.makeText(LoginActivity.this, getString(R.string.auth_failed),Toast.LENGTH_LONG).show();
                                    }
                                }else {
                                    Intent intent = new Intent(LoginActivity.this, ActivityMainMenu.class);
                                    startActivity(intent);
                                    finish();
                                }
                            }
                        });
            }
        });


    }

}
