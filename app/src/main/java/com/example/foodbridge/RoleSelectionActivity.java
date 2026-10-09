package com.example.foodbridge;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.card.MaterialCardView;

public class RoleSelectionActivity extends AppCompatActivity {

    private MaterialCardView cardDonor;
    private MaterialCardView cardNgo;
    
    private FrameLayout iconBgDonor;
    private FrameLayout iconBgNgo;
    
    private ImageView iconDonor;
    private ImageView iconNgo;
    
    private ImageView checkDonor;
    private ImageView checkNgo;
    
    private Button btnContinue;

    private String selectedRole = "Donor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_selection);

        cardDonor = findViewById(R.id.card_donor);
        cardNgo = findViewById(R.id.card_ngo);
        
        iconBgDonor = findViewById(R.id.icon_bg_donor);
        iconBgNgo = findViewById(R.id.icon_bg_ngo);
        
        iconDonor = findViewById(R.id.icon_donor);
        iconNgo = findViewById(R.id.icon_ngo);
        
        checkDonor = findViewById(R.id.check_donor);
        checkNgo = findViewById(R.id.check_ngo);
        
        btnContinue = findViewById(R.id.btn_continue);

        cardDonor.setOnClickListener(v -> selectRole("Donor"));
        cardNgo.setOnClickListener(v -> selectRole("Recipient NGO"));
        
        btnContinue.setOnClickListener(v -> {
            if (selectedRole.equals("Donor")) {
                android.content.Intent intent = new android.content.Intent(RoleSelectionActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        
        // Initial state
        selectRole("Donor");
    }

    private void selectRole(String role) {
        selectedRole = role;
        
        // Reset all
        cardDonor.setStrokeWidth(1);
        cardDonor.setStrokeColor(ContextCompat.getColor(this, R.color.surface_container_highest));
        cardDonor.setCardElevation(2f);
        iconBgDonor.setBackgroundResource(R.drawable.rounded_bg_surface_high);
        iconDonor.setColorFilter(ContextCompat.getColor(this, R.color.on_surface_variant));
        checkDonor.setImageResource(android.R.drawable.checkbox_off_background);
        checkDonor.setColorFilter(ContextCompat.getColor(this, R.color.surface_container_highest));
        
        cardNgo.setStrokeWidth(1);
        cardNgo.setStrokeColor(ContextCompat.getColor(this, R.color.surface_container_highest));
        cardNgo.setCardElevation(2f);
        iconBgNgo.setBackgroundResource(R.drawable.rounded_bg_surface_high);
        iconNgo.setColorFilter(ContextCompat.getColor(this, R.color.on_surface_variant));
        checkNgo.setImageResource(android.R.drawable.checkbox_off_background);
        checkNgo.setColorFilter(ContextCompat.getColor(this, R.color.surface_container_highest));

        // Activate selected
        if (role.equals("Donor")) {
            cardDonor.setStrokeWidth(4);
            cardDonor.setStrokeColor(ContextCompat.getColor(this, R.color.primary));
            cardDonor.setCardElevation(8f);
            iconBgDonor.setBackgroundResource(R.drawable.rounded_bg_primary);
            iconDonor.setColorFilter(ContextCompat.getColor(this, R.color.on_primary));
            checkDonor.setImageResource(android.R.drawable.checkbox_on_background);
            checkDonor.setColorFilter(ContextCompat.getColor(this, R.color.primary));
        } else if (role.equals("Recipient NGO")) {
            cardNgo.setStrokeWidth(4);
            cardNgo.setStrokeColor(ContextCompat.getColor(this, R.color.primary));
            cardNgo.setCardElevation(8f);
            iconBgNgo.setBackgroundResource(R.drawable.rounded_bg_primary);
            iconNgo.setColorFilter(ContextCompat.getColor(this, R.color.on_primary));
            checkNgo.setImageResource(android.R.drawable.checkbox_on_background);
            checkNgo.setColorFilter(ContextCompat.getColor(this, R.color.primary));
        }

        btnContinue.setText("Continue as " + role);
    }
}
