package com.felipeantonio.hexagonal.adapter.outbound;

import com.felipeantonio.hexagonal.adapter.outbound.entity.TicketEntity;
import com.felipeantonio.hexagonal.adapter.outbound.mapper.TicketOutboundMapper;
import com.felipeantonio.hexagonal.application.core.domain.Ticket;
import com.felipeantonio.hexagonal.application.port.out.AddTicketPort;
import com.felipeantonio.hexagonal.application.port.out.GetTicketByIdPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TicketRepositoryMockImpl implements AddTicketPort, GetTicketByIdPort {

    private Long lastId = 0L;
    private final Map<Long, TicketEntity> tickets = new HashMap<>();

    @Autowired
    private TicketOutboundMapper ticketOutboundMapper;

    @Override
    public void add(Ticket ticket) {
        TicketEntity entity = ticketOutboundMapper.convertDomainToEntity(ticket);
        entity.setId(++lastId);
        tickets.put(entity.getId(), entity);
    }

    @Override
    public Ticket findById(Long id) {
        TicketEntity entity = tickets.get(id);

        return ticketOutboundMapper.convertEntityToDomain(entity);
    }

}
