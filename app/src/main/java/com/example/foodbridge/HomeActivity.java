package com.example.foodbridge;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button btnCreateDonation = findViewById(R.id.btn_create_donation);
        btnCreateDonation.setOnClickListener(v -> {
            Intent intent = new Intent(this, CreateDonationActivity.class);
            startActivity(intent);
        });
        
        Button btnTrackPickup = findViewById(R.id.btn_track_pickup);
        if (btnTrackPickup != null) {
            btnTrackPickup.setOnClickListener(v -> {
                Intent intent = new Intent(this, DonationDetailsActivity.class);
                startActivity(intent);
            });
        }
    }
}
