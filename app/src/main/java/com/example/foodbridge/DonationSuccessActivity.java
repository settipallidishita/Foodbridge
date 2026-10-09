package com.example.foodbridge;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DonationSuccessActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation_success);

        Button btnViewDetails = findViewById(R.id.btn_view_details);
        Button btnHome = findViewById(R.id.btn_home);

        btnViewDetails.setOnClickListener(v -> {
            Intent intent = new Intent(this, DonationDetailsActivity.class);
            startActivity(intent);
        });

        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(this, DonorDashboardActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }
}
