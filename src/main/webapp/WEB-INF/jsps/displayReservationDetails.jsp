<html>
<head>
    <title>
        Reservation Details
    </title>
</head>
<body>
<h2>Flight Details:</h2>

Airlines: ${reservation.flightId.operatingAirlines}<br/>
Flight No: ${reservation.flightId.flightNumber}<br/>
Departure City: ${reservation.flightId.departureCity}<br/>
Arrival City: ${reservation.flightId.arrivalCity}<br/>
Date Of Departure: ${reservation.flightId.dateOfDeparture}<br/>
Estimated Departure Time: ${reservation.flightId.estimatedDepartureTime}<br/>

<h2>Passenger Details:</h2>

First Name: ${reservation.passengerId.firstName}<br/>
Last Name: ${reservation.passengerId.lastName}<br/>
Middle Name: ${reservation.passengerId.middleName}<br/>
Email: ${reservation.passengerId.email}<br/>
Phone: ${reservation.passengerId.phone}<br/>
<form action="completeCheckIn" method="post">
    Enter the Number Of Bags You want to Check In: <input type="text" name="numberOfBags"/>
    <input type="hidden" value=${reservation.id} name="reservationId"/>
    <input type="submit" value="Check In"/>
</form>
</body>
</html>