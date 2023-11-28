package com.example.airlineMidterm.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "airplane")
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "capacity")
    private int capacity;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "airline_id")
    private Airline airline;

    @OneToOne(mappedBy = "airplane")
    private Flight flight;

    // Other properties, getters, and setters
}

