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
		return flightRepository.searchFlights(origin, destination);
	}

	@Override
	public Flight getFlightById(int id) {
		// Delegate the call to the repository
		return flightRepository.getFlightById(id);
	}

	@Override
	public void bookFlight(FlightBooking booking) {
		// Validate if there are enough available seats
		Flight flight = flightRepository.getFlightById(booking.getFlight().getId());
		if (flight == null) {
			throw new RuntimeException("Flight not found with id: " + booking.getFlight().getId());
		}

		if (booking.getNumTickets() > flight.getAvailableSeats()) {
			throw new RuntimeException("Not enough available seats for booking.");
		}

		// Update available seats and book the flight
		flight.setAvailableSeats(flight.getAvailableSeats() - booking.getNumTickets());
		flightRepository.bookFlight(booking);
	}
}