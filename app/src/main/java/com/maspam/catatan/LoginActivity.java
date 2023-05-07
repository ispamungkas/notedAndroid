package com.maspam.catatan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button btnLogin, btnReister;
    TextView tvLupaPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // inisiasi komponen
        etEmail = findViewById(R.id.edt_email);
        etPassword = findViewById(R.id.sandi);
        btnLogin = findViewById(R.id.btn_login);
        btnReister = findViewById(R.id.btn_register);
        tvLupaPassword = findViewById(R.id.tv_lupa);


        // Onclick button login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Get value email & password
                String email = etEmail.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                // Validation
                if(TextUtils.isEmpty(email)){
                    etEmail.setError("Email harus di isi");
                } else if (TextUtils.isEmpty(password)){
                    etPassword.setError("Password harus di isi");
                }

                // Intent ke Activity Lain
                Intent data = new Intent(LoginActivity.this, MenuActivity.class);
                data.putExtra("email", email);
                data.putExtra("password", password);
                startActivity(data);
            }
        });

    }
}