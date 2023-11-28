package com.example.airlineMidterm.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "stop")
public class Stop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    // Relationships
    @OneToOne(mappedBy = "sourceStop")
    private Flight sourceFlight;

    @OneToOne(mappedBy = "destStop")
    private Flight destFlight;

    // Other properties, getters, and setters
}

