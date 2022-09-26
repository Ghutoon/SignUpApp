package com.example.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView user = (TextView) findViewById(R.id.Username1);
        TextView pass = (TextView) findViewById(R.id.Password1);
        MaterialButton btn = (MaterialButton) findViewById(R.id.LogInButton1);

    }
}