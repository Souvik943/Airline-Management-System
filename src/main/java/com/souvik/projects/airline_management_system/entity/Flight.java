package com.souvik.projects.airline_management_system.entity;

import com.souvik.projects.airline_management_system.model.schedule.Schedule;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Table(name = "flight_details")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Flight {

    @Id
    @Column(name = "flight_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long flightId;

    @Column(name = "flight_code")
    private String flightCode;

    @Column(name = "flight_carrier")
    private String flightCarrier;

    @Column(name = "created_by")
    private String createdByEmailId;
}
