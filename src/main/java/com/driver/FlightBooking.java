package com.driver;

public class FlightBooking {
    private int id;
    private Flight flight;
    private String passengerName;
    private int numTickets;

    public FlightBooking() {
        // Default constructor
    }

    public FlightBooking(int id, Flight flight, String passengerName, int numTickets) {
        this.id = id;
        this.flight = flight;
        this.passengerName = passengerName;
        this.numTickets = numTickets;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getNumTickets() {
        return numTickets;
    }

    public void setNumTickets(int numTickets) {
        this.numTickets = numTickets;
    }

}