package com.driver;

import java.util.List;

public class FlightBookingServiceImpl implements FlightBookingService {
	 private final FlightRepository flightRepository;

	    public FlightBookingServiceImpl(FlightRepository flightRepository) {
	        this.flightRepository = flightRepository;
	    }

	    @Override
	    public List<Flight> searchFlights(String origin, String destination) {
	        // Delegate the call to the repository
	    	// your code goes here
	        return flightRepository.searchFlights(origin, destination);
	    }

	    @Override
	    public Flight getFlightById(int id) {
	    	// your code goes here
	        return flightRepository.getFlightById(id);
	    }

	    @Override
	    public void bookFlight(FlightBooking booking) {
	    	// your code goes here
	    }
}
