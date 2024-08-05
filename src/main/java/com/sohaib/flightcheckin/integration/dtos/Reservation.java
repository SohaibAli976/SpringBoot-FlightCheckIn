package com.sohaib.flightcheckin.integration.dtos;


import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Reservation {

    private Long id;
    private Boolean checkedIn;
    private int numberOfBags;
    private Passenger passengerId;
    private Flight flightId;
    private Timestamp created;

}
