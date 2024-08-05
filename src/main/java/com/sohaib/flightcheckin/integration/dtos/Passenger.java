package com.sohaib.flightcheckin.integration.dtos;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Passenger {

    private Long id;

    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
}
