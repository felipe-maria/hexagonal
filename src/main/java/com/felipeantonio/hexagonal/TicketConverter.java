package com.felipeantonio.hexagonal;

import org.springframework.stereotype.Component;

@Component
public class TicketConverter {

    public Ticket convert(TicketDto dto) {
        Ticket entity = new Ticket();
        entity.setId(dto.getId());
        entity.setSubject(dto.getSubject());
        entity.setDescription(dto.getDescription());

        return entity;
    }

    public TicketDto convert(Ticket entity) {
        TicketDto dto = new TicketDto();
        dto.setId(entity.getId());
        dto.setSubject(entity.getSubject());
        dto.setDescription(entity.getDescription());

        return dto;
    }

}
