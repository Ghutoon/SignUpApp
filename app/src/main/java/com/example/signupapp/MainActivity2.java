package com.example.signupapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView user = (TextView) findViewById(R.id.Username1);
        TextView pass = (TextView) findViewById(R.id.Password1);
        MaterialButton btn = (MaterialButton) findViewById(R.id.LogInButton1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String username2 = user.getText().toString();
                String password2 = pass.getText().toString();
                if (Objects.equals(MainActivity.userNameAndPassword.get(username2), password2)) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Invalid input", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}