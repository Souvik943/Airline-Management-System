package com.souvik.projects.airline_management_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String scheduleId;
    private Date departureDateTime;
    private Date arrivalDateTime;
    private Airport departureAirport;
    private Airport arrivalAirport;

    public Schedule(String scheduleId, Date departureDateTime, Date arrivalDateTime, Airport departureAirport, Airport arrivalAirport) {
        this.scheduleId = scheduleId;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }
}
