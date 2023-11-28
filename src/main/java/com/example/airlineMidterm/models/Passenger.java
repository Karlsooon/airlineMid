package com.example.airlineMidterm.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "passenger")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    // Relationships
    @OneToMany(mappedBy = "passenger")
    private List<Ticket> tickets;

    @OneToMany(mappedBy = "passenger")
    private List<Baggage> baggageList;

    // Other properties, getters, and setters
}

