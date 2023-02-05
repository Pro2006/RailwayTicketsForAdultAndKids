package com.example.railwayticketsforadultandkids;

import androidx.annotation.NonNull;

public class RailwayTicket {

    private float ticketPrice;

    private String deliveryPoint;

    private String deliveryDate;

    private String deliveryTime;

    private int distance;

    private String departureTime;

    private String departurePoint;

    private String travelTime;

    private int numberOfTickets;

    public RailwayTicket() {

    }

    public RailwayTicket(float ticketPrice, int numberOfTickets) {
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;

    }

    public float countTicketPrice() {
        return ticketPrice * numberOfTickets;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public String getDeliveryPoint() {
        return deliveryPoint;
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    @NonNull
    @Override
    public String toString() {
        return "Билет: " +
                "Цена билета " + ticketPrice + " " +
                "Точка отправления " + departurePoint + " " +
                "Время отправления " + departureTime + " " +
                "Точка прибытия " + deliveryPoint + " " +
                "Время прибытия" + deliveryTime + " " +
                "Расстояние" + distance;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getDistance() {
        return distance;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }
}
