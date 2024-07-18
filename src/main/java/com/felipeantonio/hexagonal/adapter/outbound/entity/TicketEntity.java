package com.felipeantonio.hexagonal.adapter.outbound.entity;

import lombok.Data;

@Data
public class TicketEntity {

    private Long id;
    private String subject;
    private String description;

}
