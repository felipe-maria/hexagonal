package com.felipeantonio.hexagonal;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TicketRepository {

    private Long lastId = 0L;
    private final Map<Long, Ticket> tickets = new HashMap<>();

    public void add(Ticket ticket) {
        tickets.put(++lastId, ticket);
    }

    public Ticket findById(Long id) {
        return tickets.get(id);
    }
}
