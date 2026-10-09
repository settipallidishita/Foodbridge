package com.example.foodbridge;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(v -> {
            Intent intent = new Intent(this, RoleSelectionActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
