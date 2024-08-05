package com.sohaib.flightcheckin.integration.dtos;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.time.LocalDate;

@Getter
@Setter
public class Flight {

    private Long id;


    private String flightNumber;


    private String departureCity;


    private String operatingAirlines;


    private String arrivalCity;

    @DateTimeFormat(pattern = "yyyy-MM-dd")

    private LocalDate dateOfDeparture;


    private Timestamp estimatedDepartureTime;

}
