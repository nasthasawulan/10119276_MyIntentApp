package com.example.a10119276_myandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

/** Tanggal Pengerjaan : 22 April 2022
 *  NIM   : 10119276
 *  Nama  : Nasthasa Wulan Ghani Sopian
 *  Kelas : IF-7
 */

public class SplashActivity extends AppCompatActivity {
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent buka = new Intent (SplashActivity.this, LoginActivity.class);
                startActivity(buka);
                finish();
            }
        }, 3000);
    }
}