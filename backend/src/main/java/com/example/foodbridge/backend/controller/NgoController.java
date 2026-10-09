package com.example.foodbridge.backend.controller;

import com.example.foodbridge.backend.model.Ngo;
import com.example.foodbridge.backend.repository.NgoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ngos")
public class NgoController {

    private final NgoRepository ngoRepository;

    public NgoController(NgoRepository ngoRepository) {
        this.ngoRepository = ngoRepository;
    }

    @GetMapping
    public ResponseEntity<List<Ngo>> getAllNgos() {
        return ResponseEntity.ok(ngoRepository.findAll());
    }

    @GetMapping("/nearby")
    public ResponseEntity<List<Ngo>> getNearbyNgos(@RequestParam Double lat, @RequestParam Double lon) {
        // Implement spatial matching logic
        return ResponseEntity.ok(ngoRepository.findAll());
    }
}
