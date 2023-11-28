package com.example.airlineMidterm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FlightDto {
    @JsonProperty("id")
    private long id;
    @JsonProperty("fait")

    private int fait;
    @JsonProperty("journey_date")

    private LocalDate journey_date;



}
