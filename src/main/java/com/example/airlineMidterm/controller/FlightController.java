package com.example.airlineMidterm.controller;

import com.example.airlineMidterm.dto.FlightDto;
import com.example.airlineMidterm.models.Flight;
import com.example.airlineMidterm.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;
    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/all")
    public List<FlightDto> getAllFlights() {
        return flightService.getAllFlights();
    }

    }

