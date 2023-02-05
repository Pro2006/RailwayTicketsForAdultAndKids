package com.example.railwayticketsforadultandkids;

public class RailwayTicketChild extends RailwayTicket{

    private float ticketDiscount = 50;

    public RailwayTicketChild(float ticketPrice, int numberOfTickets) {
        super(ticketPrice, numberOfTickets);
    }

    public RailwayTicketChild(float ticketPrice, String deliveryPoint, String deliveryTime) {}

    public float countTicketPrice() {
        return (getTicketPrice() * getNumberOfTickets() * ticketDiscount / 100);
    }
}
