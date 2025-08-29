package com.souvik.projects.airline_management_system.builder;

import com.souvik.projects.airline_management_system.entity.User;
import com.souvik.projects.airline_management_system.model.CreateNewUserRequest;
import com.souvik.projects.airline_management_system.model.ErrorAMS;
import com.souvik.projects.airline_management_system.model.GenericResponse;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ResponseBuilder {
    public User createNewUserResponseBuilder(CreateNewUserRequest createNewUserRequest) {
        return User.builder()
                .userFirstName(createNewUserRequest.getFirstName())
                .userLastName(createNewUserRequest.getLastName())
                .userPhoneNumber(createNewUserRequest.getPhoneNumber())
                .userEmailId(createNewUserRequest.getEmailId())
                .userType(createNewUserRequest.getUserType())
                .build();
    }

    public GenericResponse errorResponseBuilder(String errorMessage, List<ErrorAMS> errorAMSList) {
        return GenericResponse.builder()
                .success(false)
                .message(errorMessage)
                .errorAMSList(errorAMSList)
                .build();
    }

    public GenericResponse successResponseBuilder(String successMessage) {
        return GenericResponse.builder()
                .success(true)
                .message(successMessage)
                .build();
    }
}
