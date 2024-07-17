package com.felipeantonio.hexagonal;

import lombok.Data;

@Data
public class TicketDto {

    private Long id;
    private String subject;
    private String description;

}
