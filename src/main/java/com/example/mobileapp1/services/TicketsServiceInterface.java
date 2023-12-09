package com.example.mobileapp1.services;

import com.example.mobileapp1.models.Tickets;

import java.util.List;

public interface TicketsServiceInterface {


    public String postpub (Tickets tickets);
    public List<Tickets> getpub ();
}
