package com.felipeantonio.hexagonal.adapter.outbound.mapper;

import com.felipeantonio.hexagonal.adapter.outbound.entity.TicketEntity;
import com.felipeantonio.hexagonal.application.core.domain.Ticket;
import org.springframework.stereotype.Component;

@Component
public class TicketOutboundMapper {

    public Ticket convertEntityToDomain(TicketEntity entity) {
        Ticket ticket = new Ticket();
        ticket.setId(entity.getId());
        ticket.setSubject(entity.getSubject());
        ticket.setDescription(entity.getDescription());

        return ticket;
    }

    public TicketEntity convertDomainToEntity(Ticket domain) {
        TicketEntity entity = new TicketEntity();
        entity.setId(domain.getId());
        entity.setSubject(domain.getSubject());
        entity.setDescription(domain.getDescription());

        return entity;
    }

}
