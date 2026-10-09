package com.example.foodbridge.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "volunteers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Volunteer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String availabilityStatus;

    private Double currentLatitude;
    private Double currentLongitude;
}
