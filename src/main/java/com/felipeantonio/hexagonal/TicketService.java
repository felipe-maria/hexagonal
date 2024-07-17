package com.felipeantonio.hexagonal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    private TicketConverter ticketConverter;

    public void add(TicketDto dto) {
        Ticket entity = ticketConverter.convert(dto);

        ticketRepository.add(entity);
    }

    public TicketDto getTicketById(Long id) {
        Ticket entity = ticketRepository.findById(id);

        return ticketConverter.convert(entity);
    }
}
