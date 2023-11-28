package com.example.airlineMidterm.repositories;

// FlightRepository.java
import com.example.airlineMidterm.dto.FlightDto;
import com.example.airlineMidterm.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<FlightDto, Long> {
}

