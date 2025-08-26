package com.souvik.projects.airline_management_system.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "ticket")
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private String ticketId;

    @Column(name = "flight_id")
    private String flightId;

    @Column(name = "user_id")
    private String userId;

    public Ticket(String ticketId, String flightId, String userId) {
        this.ticketId = ticketId;
        this.flightId = flightId;
        this.userId = userId;
    }
}
