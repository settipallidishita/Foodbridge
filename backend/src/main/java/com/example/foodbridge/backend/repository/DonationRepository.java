package com.example.foodbridge.backend.repository;

import com.example.foodbridge.backend.model.Donation;
import com.example.foodbridge.backend.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {
    List<Donation> findByStatus(Status status);
    List<Donation> findByDonorId(Long donorId);
}
