package com.sohaib.flightcheckin.integration;

import com.sohaib.flightcheckin.integration.dtos.Reservation;
import com.sohaib.flightcheckin.integration.dtos.ReservationUpdateRequest;

public interface ReservationRestClient {
    public Reservation findReservation(Long id);
    public Reservation updateReservation(ReservationUpdateRequest request);
}
