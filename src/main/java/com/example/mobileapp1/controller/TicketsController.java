package com.example.mobileapp1.controller;

import com.example.mobileapp1.models.Tickets;
import com.example.mobileapp1.services.TicketsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tickets")
@CrossOrigin
public class TicketsController {
    @Autowired
    private TicketsServices ticketsServices;


    @PostMapping("/post")
    public String postpub(@RequestBody Tickets tickets)
    {
        return ticketsServices.postpub(tickets);

    }
    @GetMapping("/get")
    public List<Tickets> getpubli()
    {
        return ticketsServices.getpub();
    }
}
