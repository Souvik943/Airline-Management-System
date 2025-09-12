package com.souvik.projects.airline_management_system.model.schedule;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    private Date arrivalTime;
    private Date departureTime;
    private String arrivalAirportCity;
    private String departureAirportCity;
}
