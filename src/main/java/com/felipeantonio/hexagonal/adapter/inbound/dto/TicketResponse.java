package com.felipeantonio.hexagonal.adapter.inbound.dto;

import lombok.Data;

@Data
public class TicketResponse {

    private Long id;
    private String subject;
    private String description;

}
