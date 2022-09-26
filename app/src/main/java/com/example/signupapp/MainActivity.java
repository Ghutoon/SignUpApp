package com.example.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    public static final String Tag = "TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText username = (EditText) findViewById(R.id.Username);
        EditText password = (EditText) findViewById(R.id.Password);
        EditText email = (EditText) findViewById(R.id.Email);
        EditText confirm_password = (EditText) findViewById(R.id.ConfirmPassword);
        MaterialButton regbtn = (MaterialButton)  findViewById(R.id.SignUpButton);
        MaterialButton logbtn = (MaterialButton)  findViewById(R.id.LogInButton);

        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), MainActivity2.class));
            }
        });
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String username1 = username.getText().toString();
                final String email1 = email.getText().toString();
                String password1 = password.getText().toString();
                String confirm = confirm_password.getText().toString();

            }
        });
    }
}