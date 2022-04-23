package com.example.a10119276_myandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

/** Tanggal Pengerjaan : 22 April 2022
 *  NIM   : 10119276
 *  Nama  : Nasthasa Wulan Ghani Sopian
 *  Kelas : IF-7
 */

public class LoginActivity extends AppCompatActivity {
    private Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
    }

    public void Register(View view) {
        Intent regis = new Intent(LoginActivity.this,RegistrationActivity.class);
        startActivity(regis);
    }

    public void Login(View view) {
        Intent login = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(login);
    }
}