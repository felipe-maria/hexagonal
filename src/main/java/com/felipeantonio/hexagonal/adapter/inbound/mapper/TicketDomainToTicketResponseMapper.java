package com.felipeantonio.hexagonal.adapter.inbound.mapper;

import com.felipeantonio.hexagonal.adapter.inbound.dto.TicketResponse;
import com.felipeantonio.hexagonal.application.core.domain.Ticket;
import org.springframework.stereotype.Component;

@Component
public class TicketDomainToTicketResponseMapper {

    public TicketResponse map(Ticket domain) {
        TicketResponse response = new TicketResponse();
        response.setId(domain.getId());
        response.setSubject(domain.getSubject());
        response.setDescription(domain.getDescription());

        return response;
    }

}
