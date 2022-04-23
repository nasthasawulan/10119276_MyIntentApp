package com.example.a10119276_myandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/** Tanggal Pengerjaan : 22 April 2022
 *  NIM   : 10119276
 *  Nama  : Nasthasa Wulan Ghani Sopian
 *  Kelas : IF-7
 */

public class MainActivity extends AppCompatActivity {
    private Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        button = findViewById(R.id.btn_logout);
        button2 = findViewById(R.id.btn_profile);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void Logout(View view) {
        Intent login = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(login);
    }

    public void Profile(View view) {
        Intent prof = new Intent(MainActivity.this,ProfileActivity.class);
        startActivity(prof);
    }
}