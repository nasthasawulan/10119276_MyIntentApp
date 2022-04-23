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

public class ProfileActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        button = findViewById(R.id.btn_menu);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().hide();
    }

    public void Menu(View view) {
        Intent menu = new Intent(ProfileActivity.this,MainActivity.class);
        startActivity(menu);
    }
}