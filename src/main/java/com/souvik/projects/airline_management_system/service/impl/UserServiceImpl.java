package com.souvik.projects.airline_management_system.service.impl;

import com.souvik.projects.airline_management_system.builder.ResponseBuilder;
import com.souvik.projects.airline_management_system.model.ErrorAMS;
import com.souvik.projects.airline_management_system.entity.User;
import com.souvik.projects.airline_management_system.model.CreateNewUserRequest;
import com.souvik.projects.airline_management_system.model.GenericResponse;
import com.souvik.projects.airline_management_system.repository.UserRepository;
import com.souvik.projects.airline_management_system.service.UserService;
import com.souvik.projects.airline_management_system.validator.ValidateUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ValidateUser validateUser;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ResponseBuilder responseBuilder;

    @Override
    public ResponseEntity<GenericResponse> createNewUser(CreateNewUserRequest createNewUserRequest) {
        log.info("Service to Create a New User Starts  ...");
        List<ErrorAMS> errorAMSList = new ArrayList<>();
        try {
            validateUser.validateUserDetailsWhileCreation(createNewUserRequest, errorAMSList);
            if(!errorAMSList.isEmpty()) {
                log.info("There are some issues with the request ...");
                log.info("Service to Create a New User Stops  ...");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body(responseBuilder.errorResponseBuilder("Error while creating an User", errorAMSList));
            }
            User user = responseBuilder.createNewUserResponseBuilder(createNewUserRequest);
            userRepository.save(user);
            log.info("Service to Create a New User Stops  ...");
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(responseBuilder.successResponseBuilder("User created successfully"));
        } catch (DataAccessException dax) {
            log.error("Database Exception : ", dax);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(responseBuilder.errorResponseBuilder(dax.getMessage(), null));
        } catch (Exception e) {
            log.error("Internal Server Error : ", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(responseBuilder.errorResponseBuilder(e.getMessage(), null));
        }

    }
}
