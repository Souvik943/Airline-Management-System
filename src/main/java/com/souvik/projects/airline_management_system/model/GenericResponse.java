package com.souvik.projects.airline_management_system.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GenericResponse {

    boolean success;

    String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    List<ErrorAMS> errorAMSList;
}
