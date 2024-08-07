package com.sohaib.flightcheckin.controllers;

import com.sohaib.flightcheckin.integration.ReservationRestClient;
import com.sohaib.flightcheckin.integration.dtos.Reservation;
import com.sohaib.flightcheckin.integration.dtos.ReservationUpdateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CheckInController {

    @Autowired
    ReservationRestClient reservationRestClient;

    @GetMapping
    public String checkin() {
        return "index";
    }

    @RequestMapping("/showStartCheckin")
    public String showStartCheckIn()
    {
        return "startCheckin";
    }

    @PostMapping("/startCheckin")
    public String startCheckIn(@RequestParam("reservationId") Long reservatioId, ModelMap modelMap)
    {
       Reservation reservation= reservationRestClient.findReservation(reservatioId);
        modelMap.addAttribute("reservation", reservation);
        return "displayReservationDetails";
    }

    @PostMapping("/completeCheckIn")
    public String completeCheckIn(@RequestParam("reservationId") Long reservationId,@RequestParam("numberOfBags") int numberOfBags)
    {
        ReservationUpdateRequest reservationUpdateRequest = new ReservationUpdateRequest();
        reservationUpdateRequest.setId(reservationId);
        reservationUpdateRequest.setNumberOfBags(numberOfBags);
        reservationUpdateRequest.setCheckedIn(true);
        reservationRestClient.updateReservation(reservationUpdateRequest);
        return "checkInComfirmation";
    }
}
