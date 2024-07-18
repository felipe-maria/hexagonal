package com.felipeantonio.hexagonal.config;

import com.felipeantonio.hexagonal.application.core.usecase.AddTicketUseCase;
import com.felipeantonio.hexagonal.application.core.usecase.GetTicketByIdUseCase;
import com.felipeantonio.hexagonal.application.port.in.GetTicketByIdUseCasePort;
import com.felipeantonio.hexagonal.application.port.out.AddTicketPort;
import com.felipeantonio.hexagonal.application.port.out.GetTicketByIdPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public AddTicketUseCase addTicketUseCase(final AddTicketPort addTicketPort){
        return new AddTicketUseCase(addTicketPort);
    }

    @Bean
    public GetTicketByIdUseCasePort getTicketByIdUseCasePort(final GetTicketByIdPort getTicketByIdPort){
        return new GetTicketByIdUseCase(getTicketByIdPort);
    }

}
