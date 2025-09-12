package com.souvik.projects.airline_management_system.model.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.souvik.projects.airline_management_system.entity.User;
import com.souvik.projects.airline_management_system.model.GenericResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetUsersResponse {
    private GenericResponse genericResponse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private User user;
}
