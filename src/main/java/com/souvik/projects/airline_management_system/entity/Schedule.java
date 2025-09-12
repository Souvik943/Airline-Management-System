package com.souvik.projects.airline_management_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Table(name = "schedule_details")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private long scheduleId;

    @Column(name = "flight_code")
    private String flightCode;

    @Column(name = "arrival_time")
    private Date arrivalTime;

    @Column(name = "departure_time")
    private Date departureTime;

    @Column(name = "arrival_city")
    private String arrivalCity;

    @Column(name = "departure_city")
    private String departureCity;

}
