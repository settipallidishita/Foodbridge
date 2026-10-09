package com.example.foodbridge.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ngos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ngo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String organizationName;

    @Column(nullable = false)
    private String registrationNumber;

    @Column(nullable = false)
    private String address;

    private Double latitude;
    private Double longitude;
    private String verificationStatus;
}
