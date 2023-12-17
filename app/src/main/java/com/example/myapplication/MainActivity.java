package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    TextInputEditText name, email, password, mobile;
    MaterialButton sign_up, login;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.name);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.password);
        mobile = findViewById(R.id.mobileno);
        login = findViewById(R.id.login);
        sign_up = findViewById(R.id.sign_up);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validation();
            }


        });


    }

    void validation() {
        if (name.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "name cannot be empty", Toast.LENGTH_SHORT).show();

        } else if (email.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "empty email", Toast.LENGTH_SHORT).show();
        } else if (password.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "empty password", Toast.LENGTH_SHORT).show();
        } else if (mobile.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "enter mobile", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(MainActivity.this, DashboardActivity.class);

            i.putExtra("name", name.getText().toString());
            i.putExtra("email", email.getText().toString());
            i.putExtra("password", password.getText().toString());
            i.putExtra("mobile", mobile.getText().toString());

            startActivity(i);


        }
    }

}
