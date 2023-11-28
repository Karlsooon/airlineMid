package com.example.airlineMidterm.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "ticket")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seat_number")
    private int seatNumber;

    @Column(name = "is_cancellable")
    private boolean isCancellable;
    @Column(name = "journey_date")
    private LocalDate journeyDate;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "flight_schedule_id", referencedColumnName = "id")
    private FlightSchedule flightSchedule;

    // Other properties, getters, and setters
}

