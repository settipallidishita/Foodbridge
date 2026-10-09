package com.example.foodbridge;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class DonorDashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_dashboard);

        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton fab = findViewById(R.id.fab_new_donation);
        if (fab != null) {
            fab.setOnClickListener(v -> {
                android.content.Intent intent = new android.content.Intent(this, DonationSuccessActivity.class);
                startActivity(intent);
            });
        }
    }
}
