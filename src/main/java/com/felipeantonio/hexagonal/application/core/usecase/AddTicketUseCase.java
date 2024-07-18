package com.felipeantonio.hexagonal.application.core.usecase;

import com.felipeantonio.hexagonal.application.core.domain.Ticket;
import com.felipeantonio.hexagonal.application.port.in.AddTicketUseCasePort;
import com.felipeantonio.hexagonal.application.port.out.AddTicketPort;

public class AddTicketUseCase implements AddTicketUseCasePort {

    private final AddTicketPort addTicketPort;

    public AddTicketUseCase(AddTicketPort addTicketPort) {
        this.addTicketPort = addTicketPort;
    }

    @Override
    public void addTicket(Ticket ticket) {
        addTicketPort.add(ticket);
    }

}
