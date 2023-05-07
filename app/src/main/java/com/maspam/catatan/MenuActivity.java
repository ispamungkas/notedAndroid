package com.maspam.catatan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView tvEmail, tvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tvEmail = findViewById(R.id.tv_email);
        tvPassword = findViewById(R.id.tv_password);

        Bundle extras = getIntent().getExtras();
        String email = extras.getString("email");
        String password = extras.getString("password");

        tvEmail.setText(email);
        tvPassword.setText(password);
    }
}