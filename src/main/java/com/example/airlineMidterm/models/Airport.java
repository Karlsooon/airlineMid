package com.example.airlineMidterm.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "airport")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    // Relationships
    @OneToMany(mappedBy = "sourceAirport")
    private List<AirportConnection> sourceConnections;

    @OneToMany(mappedBy = "destinationAirport")
    private List<AirportConnection> destinationConnections;

    // Other properties, getters, and setters
}

