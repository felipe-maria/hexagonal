package com.felipeantonio.hexagonal.application.port.in;

import com.felipeantonio.hexagonal.application.core.domain.Ticket;

public interface GetTicketByIdUseCasePort {

    Ticket getTicketById(Long id);

}
