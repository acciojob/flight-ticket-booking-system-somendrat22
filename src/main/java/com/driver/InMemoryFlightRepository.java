package com.driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryFlightRepository implements FlightRepository {

	 private final Map<Integer, Flight> flights;
	    private final Map<Integer, FlightBooking> bookings;
	    private int bookingId;

	    public InMemoryFlightRepository() {
	    	// your code goes here
	    }

	    @Override
	    public List<Flight> searchFlights(String origin, String destination) {
	        List<Flight> result = new ArrayList<>();
	        // your code goes here
	        return result;
	    }

	    @Override
	    public Flight getFlightById(int id) {
	    	// your code goes here
	        return flights.get(id);
	    }

	    @Override
	    public void bookFlight(FlightBooking booking) {
	    	// your code goes here
	    }
}
