package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
    TextInputEditText user_name, password;
    MaterialButton login;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = findViewById(R.id.login);
        user_name = findViewById(R.id.user_name);
        password = findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validation();
            }
        });

    }

    void validation() {
        if (user_name.getText().toString().isEmpty())
            Toast.makeText(this, "enter user name", Toast.LENGTH_SHORT).show();
        else if (password.getText().toString().isEmpty())
            Toast.makeText(this, "enter password", Toast.LENGTH_SHORT).show();
        else {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

    }
}