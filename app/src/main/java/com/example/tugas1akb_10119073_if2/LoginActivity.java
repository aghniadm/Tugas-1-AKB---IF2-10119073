// 23 April 2022
// 10119073
// Aghnia Dewi Mahiranie
// IF-2

package com.example.tugas1akb_10119073_if2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
    }

    public void registration(View view) {
        Intent intent= new Intent(LoginActivity.this, RegistrationActivity.class);
        startActivity(intent);
    }

    public void login(View view) {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);
    }
}