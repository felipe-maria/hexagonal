package com.felipeantonio.hexagonal.application.port.out;

import com.felipeantonio.hexagonal.application.core.domain.Ticket;

public interface AddTicketPort {

    void add(Ticket ticket);

}
