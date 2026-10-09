package com.example.foodbridge.backend.controller;

import com.example.foodbridge.backend.model.Donation;
import com.example.foodbridge.backend.repository.DonationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donations")
public class DonationController {
    
    private final DonationRepository donationRepository;
    
    public DonationController(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }
    
    @GetMapping
    public ResponseEntity<List<Donation>> getAllDonations() {
        return ResponseEntity.ok(donationRepository.findAll());
    }
    
    @PostMapping
    public ResponseEntity<Donation> createDonation(@RequestBody Donation donation) {
        return ResponseEntity.ok(donationRepository.save(donation));
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Donation> getDonationById(@PathVariable Long id) {
        return donationRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Donation> updateDonation(@PathVariable Long id, @RequestBody Donation donationDetails) {
        return donationRepository.findById(id)
                .map(donation -> {
                    // Update fields
                    donation.setStatus(donationDetails.getStatus());
                    return ResponseEntity.ok(donationRepository.save(donation));
                })
                .orElse(ResponseEntity.notFound().build());
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDonation(@PathVariable Long id) {
        return donationRepository.findById(id)
                .map(donation -> {
                    donationRepository.delete(donation);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
    
    @PostMapping("/{id}/accept")
    public ResponseEntity<Donation> acceptDonation(@PathVariable Long id) {
        // Implement logic to accept
        return ResponseEntity.ok().build();
    }
}
