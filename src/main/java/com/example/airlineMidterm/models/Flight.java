package com.example.airlineMidterm.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fare")
    private int fare;

    // Relationships
    @ManyToOne
    @JoinColumn(name = "airline_id")
    private Airline airline;

    @Column(name = "journey_date")
    private LocalDate journeyDate;
    @ManyToOne
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;

    @ManyToOne
    @JoinColumn(name = "source_stop_id")
    private Stop sourceStop;

    @ManyToOne
    @JoinColumn(name = "dest_stop_id")
    private Stop destStop;

    @ManyToOne
    @JoinColumn(name = "flight_schedule_id")
    private FlightSchedule flightSchedule;
}
