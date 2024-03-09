package com.driver;

import java.util.List;

public interface FlightBookingService {
    List<Flight> searchFlights(String origin, String destination);

    Flight getFlightById(int id);

    void bookFlight(FlightBooking booking);
}