package com.example.airlineMidterm.services;

// FlightService.java

import com.example.airlineMidterm.dto.FlightDto;
import com.example.airlineMidterm.models.Flight;
import com.example.airlineMidterm.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public List<FlightDto> getAllFlights() {
        return flightRepository.findAll();
    }


}

