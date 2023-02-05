package com.example.railwayticketsforadultandkids;

public class RailwayTicketPensioner extends RailwayTicket {
    private float ticketDiscount = 30;

    public RailwayTicketPensioner(float ticketPrice, int numberOfTickets) {
        super(ticketPrice, numberOfTickets);
    }

    public RailwayTicketPensioner(float ticketPrice, String deliveryPoint, String deliveryTime) {}

    public float countTicketPrice() {
        return (getTicketPrice() * getNumberOfTickets() * ticketDiscount / 100);
    }
}
