package com.example.foodbridge.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteers")
public class VolunteerController {

    @GetMapping("/tasks")
    public ResponseEntity<List<Object>> getTasks() {
        return ResponseEntity.ok(List.of());
    }

    @PostMapping("/tasks/{id}/accept")
    public ResponseEntity<Void> acceptTask(@PathVariable Long id) {
        return ResponseEntity.ok().build();
    }
}
