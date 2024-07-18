package com.felipeantonio.hexagonal.application.core.usecase;

import com.felipeantonio.hexagonal.application.core.domain.Ticket;
import com.felipeantonio.hexagonal.application.port.in.GetTicketByIdUseCasePort;
import com.felipeantonio.hexagonal.application.port.out.GetTicketByIdPort;

public class GetTicketByIdUseCase implements GetTicketByIdUseCasePort {

    private final GetTicketByIdPort getTicketByIdPort;

    public GetTicketByIdUseCase(final GetTicketByIdPort getTicketByIdPort) {
        this.getTicketByIdPort = getTicketByIdPort;
    }

    @Override
    public Ticket getTicketById(Long id) {
        return getTicketByIdPort.findById(id);
    }

}
