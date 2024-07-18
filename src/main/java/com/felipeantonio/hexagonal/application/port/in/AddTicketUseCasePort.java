package com.felipeantonio.hexagonal.application.port.in;

import com.felipeantonio.hexagonal.application.core.domain.Ticket;

public interface AddTicketUseCasePort {

    void addTicket(Ticket ticket);

}
