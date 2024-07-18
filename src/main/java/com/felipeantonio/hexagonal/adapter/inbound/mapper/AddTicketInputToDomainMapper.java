package com.felipeantonio.hexagonal.adapter.inbound.mapper;

import com.felipeantonio.hexagonal.adapter.inbound.dto.AddTicketInput;
import com.felipeantonio.hexagonal.application.core.domain.Ticket;
import org.springframework.stereotype.Component;

@Component
public class AddTicketInputToDomainMapper {

    public Ticket map(AddTicketInput input) {
        Ticket domain = new Ticket();
        domain.setSubject(input.getSubject());
        domain.setDescription(input.getDescription());

        return domain;
    }

}
