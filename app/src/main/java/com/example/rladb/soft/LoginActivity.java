package com.example.rladb.soft;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;

import com.google.android.gms.tasks.Task;

import com.google.firebase.auth.AuthResult;

import com.google.firebase.auth.FirebaseAuth;


public class LoginActivity extends AppCompatActivity implements OnClickListener{

    private Button mbuttonTSignbutton;
    private Button mbuttonCSignbutton;
    private Button join;

    private Button login;

    private EditText email_login;

    private EditText pwd_login;

    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button tsignbutton = (Button) findViewById(R.id.Tsignbutton);
        tsignbutton.setOnClickListener(this);

        Button csignbutton = (Button) findViewById(R.id.Csignbutton);
        csignbutton.setOnClickListener(this);

        join = (Button) findViewById(R.id.main_join_btn);
        login = (Button) findViewById(R.id.Csignbutton);
        email_login = (EditText) findViewById(R.id.idText);
        pwd_login = (EditText) findViewById(R.id.idPassworldText);
        firebaseAuth = firebaseAuth.getInstance();

        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String email = email_login.getText().toString().trim();
                String pwd = pwd_login.getText().toString().trim();
                firebaseAuth.signInWithEmailAndPassword(email, pwd)
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>()
                        {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task)
                            {
                                if (task.isSuccessful())
                                {
                                    Intent intent = new Intent(LoginActivity.this, CustomerActivity.class);
                                    startActivity(intent);
                                }
                                else
                                    {
                                    Toast.makeText(LoginActivity.this, "로그인 오류", Toast.LENGTH_SHORT).show();
                                    }
                            }
                        });
                join.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Csignbutton:
                Intent intentCSignbutton = new Intent(this, CustomerActivity.class);
                startActivity(intentCSignbutton);
                break;
            case R.id.Tsignbutton:
                Intent intentTSignbutton = new Intent(this, TrainermainActivity.class);
                startActivity(intentTSignbutton);
                break;
        }
    }
}