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
		this.flights = new HashMap<>();
		this.bookings = new HashMap<>();
		this.bookingId = 1;

		// Initialize some sample data for testing
		Flight flight1 = new Flight(1, "ABC123", "CityA", "CityB", 200.0, 100, 100);
		Flight flight2 = new Flight(2, "XYZ789", "CityC", "CityD", 150.0, 80, 80);

		flights.put(1, flight1);
		flights.put(2, flight2);
	}

	@Override
	public List<Flight> searchFlights(String origin, String destination) {
		List<Flight> result = new ArrayList<>();
		for (Flight flight : flights.values()) {
			if (flight.getOrigin().equalsIgnoreCase(origin) && flight.getDestination().equalsIgnoreCase(destination)) {
				result.add(flight);
			}
		}
		return result;
	}

	@Override
	public Flight getFlightById(int id) {
		return flights.get(id);
	}

	@Override
	public void bookFlight(FlightBooking booking) {
		booking.setId(bookingId);
		bookings.put(bookingId, booking);
		bookingId++;

		// Update the available seats in the corresponding flight
		Flight flight = flights.get(booking.getFlight().getId());
		if (flight != null) {
			flight.setAvailableSeats(flight.getAvailableSeats() - booking.getNumTickets());
		}
	}
}