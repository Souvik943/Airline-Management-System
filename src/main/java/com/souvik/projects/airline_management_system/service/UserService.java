package com.souvik.projects.airline_management_system.service;

import com.souvik.projects.airline_management_system.model.CreateNewUserRequest;
import com.souvik.projects.airline_management_system.model.GenericResponse;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<GenericResponse> createNewUser(CreateNewUserRequest createNewUserRequest);
}
