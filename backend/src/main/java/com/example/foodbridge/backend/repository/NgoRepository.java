package com.example.foodbridge.backend.repository;

import com.example.foodbridge.backend.model.Ngo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NgoRepository extends JpaRepository<Ngo, Long> {
    Optional<Ngo> findByUserId(Long userId);
}
