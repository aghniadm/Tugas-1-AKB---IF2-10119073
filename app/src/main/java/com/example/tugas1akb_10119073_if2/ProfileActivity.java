// 23 April 2022
// 10119073
// Aghnia Dewi Mahiranie
// IF-2

package com.example.tugas1akb_10119073_if2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().hide();
    }
}