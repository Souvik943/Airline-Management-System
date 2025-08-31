package com.souvik.projects.airline_management_system.controller;

import com.souvik.projects.airline_management_system.model.CreateNewUserRequest;
import com.souvik.projects.airline_management_system.model.GenericResponse;
import com.souvik.projects.airline_management_system.model.GetUserRequest;
import com.souvik.projects.airline_management_system.model.GetUsersResponse;
import com.souvik.projects.airline_management_system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tripper/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<GenericResponse> createUser(
            @RequestBody CreateNewUserRequest createNewUserRequest) {
        return userService.createNewUser(createNewUserRequest);
    }

    @GetMapping("/getUser")
    public ResponseEntity<GetUsersResponse> getUser(
            @RequestBody GetUserRequest getUserRequest) {
        return userService.getUser(getUserRequest);
    }
}

