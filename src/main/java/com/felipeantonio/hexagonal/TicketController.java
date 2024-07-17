package com.felipeantonio.hexagonal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TicketController {

    @Autowired
    public TicketService ticketService;

    @PostMapping("/tickets")
    public void addTicket(@RequestBody TicketDto newTicket) {
        ticketService.add(newTicket);
    }

    @GetMapping("/tickets/{id}")
    public TicketDto getTicketById(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

}
