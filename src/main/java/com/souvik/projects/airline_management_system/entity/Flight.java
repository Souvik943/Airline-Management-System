package com.souvik.projects.airline_management_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "flight")
@Entity
public class Flight {

    @Column(name = "flight_carrier")
    private String flightCarrier;

    @Column(name = "flight_code")
    private String flightCode;

    @Column(name = "flight_schedule_id")
    private String flightScheduleId;

    public Flight(String flightCarrier, String flightCode, String flightScheduleId) {
        this.flightCarrier = flightCarrier;
        this.flightCode = flightCode;
        this.flightScheduleId = flightScheduleId;
    }
}
