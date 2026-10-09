package com.example.foodbridge.backend.service;

import com.example.foodbridge.backend.model.Donation;
import com.example.foodbridge.backend.model.Ngo;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MatchingService {

    /**
     * Rule-based matching system without AI.
     * Priority Score = Distance Score + Expiry Urgency Score + Quantity Compatibility Score + Volunteer Availability Score
     */
    public List<Donation> recommendDonationsForNgo(Ngo ngo, List<Donation> availableDonations) {
        return availableDonations.stream()
                .sorted(Comparator.comparingDouble(donation -> -calculatePriorityScore(ngo, donation)))
                .collect(Collectors.toList());
    }

    private double calculatePriorityScore(Ngo ngo, Donation donation) {
        double distanceScore = calculateDistanceScore(ngo.getLatitude(), ngo.getLongitude(), donation.getLatitude(), donation.getLongitude());
        double expiryScore = 100.0; // Placeholder for expiry urgency score
        double quantityScore = 100.0; // Placeholder for quantity compatibility score
        double volunteerScore = 100.0; // Placeholder for volunteer availability
        
        return distanceScore + expiryScore + quantityScore + volunteerScore;
    }

    private double calculateDistanceScore(Double lat1, Double lon1, Double lat2, Double lon2) {
        if (lat1 == null || lon1 == null || lat2 == null || lon2 == null) {
            return 0.0;
        }
        // Basic Euclidean distance for placeholder, would use Haversine in production
        double distance = Math.sqrt(Math.pow(lat1 - lat2, 2) + Math.pow(lon1 - lon2, 2));
        // Max score of 100, decreases with distance
        return Math.max(0, 100 - (distance * 10)); 
    }
}
