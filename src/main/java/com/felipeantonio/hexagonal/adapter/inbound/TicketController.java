package com.felipeantonio.hexagonal.adapter.inbound;

import com.felipeantonio.hexagonal.adapter.inbound.dto.AddTicketInput;
import com.felipeantonio.hexagonal.adapter.inbound.dto.TicketResponse;
import com.felipeantonio.hexagonal.adapter.inbound.mapper.AddTicketInputToDomainMapper;
import com.felipeantonio.hexagonal.adapter.inbound.mapper.TicketDomainToTicketResponseMapper;
import com.felipeantonio.hexagonal.application.core.domain.Ticket;
import com.felipeantonio.hexagonal.application.port.in.AddTicketUseCasePort;
import com.felipeantonio.hexagonal.application.port.in.GetTicketByIdUseCasePort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final AddTicketUseCasePort addTicketUseCasePort;
    private final GetTicketByIdUseCasePort getTicketByIdUseCasePort;

    private final AddTicketInputToDomainMapper addTicketInputToDomainMapper;
    private final TicketDomainToTicketResponseMapper ticketDomainToTicketResponseMapper;

    @PostMapping
    public void addTicket(@RequestBody AddTicketInput input) {
        Ticket domain = addTicketInputToDomainMapper.map(input);
        addTicketUseCasePort.addTicket(domain);
    }

    @GetMapping("/{id}")
    public TicketResponse getTicketById(@PathVariable Long id) {
        Ticket domain = getTicketByIdUseCasePort.getTicketById(id);
        return ticketDomainToTicketResponseMapper.map(domain);
    }

}