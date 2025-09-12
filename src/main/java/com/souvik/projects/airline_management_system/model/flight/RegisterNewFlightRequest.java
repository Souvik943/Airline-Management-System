package com.souvik.projects.airline_management_system.model.flight;

import com.souvik.projects.airline_management_system.model.schedule.Schedule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterNewFlightRequest {
    private String flightCode;
    private String flightCarrier;
    private List<Schedule> scheduleList;
    private String createdByEmailId;
}
