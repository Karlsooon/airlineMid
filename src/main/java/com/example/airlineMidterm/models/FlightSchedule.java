package com.example.airlineMidterm.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "flight_schedule")
public class FlightSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "trip_date")
    private LocalDate tripDate;

    @Column(name = "available_seats")
    private int availableSeats;

    // Relationships
    @OneToMany(mappedBy = "flightSchedule")
    private List<Flight> flights;

    // Other properties, getters, and setters
}

