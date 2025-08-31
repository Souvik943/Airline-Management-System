package com.souvik.projects.airline_management_system.service;

import com.souvik.projects.airline_management_system.model.CreateNewUserRequest;
import com.souvik.projects.airline_management_system.model.GenericResponse;
import com.souvik.projects.airline_management_system.model.GetUserRequest;
import com.souvik.projects.airline_management_system.model.GetUsersResponse;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<GenericResponse> createNewUser(CreateNewUserRequest createNewUserRequest);
    ResponseEntity<GetUsersResponse> getUser(GetUserRequest getUserRequest);
}
