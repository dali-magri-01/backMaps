package com.example.mobileapp1.services;

import com.example.mobileapp1.models.Tickets;
import com.example.mobileapp1.repository.TicketsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TicketsServices implements TicketsServiceInterface {
    @Autowired
    private TicketsRepository ticketsRepository;


    @Override
    public String postpub (Tickets tickets)
    {
    ticketsRepository.save(tickets);
    return "success";
    }
    @Override
    public List<Tickets> getpub ()
    {
       return ticketsRepository.findAll();

    }
}
