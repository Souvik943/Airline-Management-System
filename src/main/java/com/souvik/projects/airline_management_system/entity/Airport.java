package com.souvik.projects.airline_management_system.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "airport")
@Entity
public class Airport {

    @Column(name = "airport_code")
    private String airportCode;

    @Column(name = "airport_city")
    private String city;

    @Column(name = "airport_state")
    private String state;

    public Airport(String airportCode, String city, String state) {
        this.airportCode = airportCode;
        this.city = city;
        this.state = state;
    }
}
