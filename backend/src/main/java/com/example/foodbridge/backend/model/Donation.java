package com.example.foodbridge.backend.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "donations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "donor_id", nullable = false)
    private User donor;

    @Column(nullable = false)
    private String foodName;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Integer estimatedServings;

    @Column(nullable = false)
    private LocalDateTime preparedAt;

    @Column(nullable = false)
    private LocalDateTime expiryAt;

    @Column(nullable = false)
    private String pickupAddress;

    private Double latitude;
    private Double longitude;
    private String imageUrl;
    
    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
}
