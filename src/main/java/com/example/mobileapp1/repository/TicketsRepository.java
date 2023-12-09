package com.example.mobileapp1.repository;

import com.example.mobileapp1.models.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TicketsRepository extends JpaRepository<Tickets,Integer> {
}
