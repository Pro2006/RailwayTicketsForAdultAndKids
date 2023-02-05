package com.example.railwayticketsforadultandkids;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private TextView ticketOut;
    private TextView ticketChildOut;
    private TextView ticketTotalOut;
    private TextView ticketPensionerOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ticketOut = findViewById(R.id.ticketOut);
        ticketChildOut = findViewById(R.id.ticketChildOut);
        ticketTotalOut = findViewById(R.id.ticketTotalOut);
        ticketPensionerOut = findViewById(R.id.ticketPensionerOut);

        HashMap<String, Float> prices = createTicketsAndOutPrices();

        printText(prices);


    }

    private HashMap<String, Float> createTicketsAndOutPrices() {
        RailwayTicket ticket = new RailwayTicket(70, 9);

        RailwayTicket childTickets = new RailwayTicketChild(70, 11);

        RailwayTicket pensionerTickets = new RailwayTicketPensioner(70, 5);

        float overallPrice = ticket.countTicketPrice();

        float overallChildPrice = childTickets.countTicketPrice();

        float overallPensionerPrice = pensionerTickets.countTicketPrice();
        HashMap<String, Float> listOfTickets = new HashMap<>();
        listOfTickets.put("Adult", overallPrice);
        listOfTickets.put("Kids", overallChildPrice);
        listOfTickets.put("Pensioners", overallPensionerPrice);

        return listOfTickets;


    }

    @SuppressLint("SetTextI18n")
    private void printText(HashMap<String, Float> prices) {
        ticketOut.setText("Билеты для взрослых " + prices.get("Adult") + " монет");
        ticketChildOut.setText("Билеты для детей " + prices.get("Kids") + " монет");
        ticketPensionerOut.setText("Билеты для пенсионеров " + prices.get("Pensioners") + " монет");
        ticketTotalOut.setText("Общая сумма билетов: " + (prices.get("Adult") + prices.get("Kids")
                + prices.get("Pensioners")) + "монет");
    }
}

