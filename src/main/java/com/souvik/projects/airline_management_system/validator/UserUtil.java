package com.souvik.projects.airline_management_system.validator;

import com.souvik.projects.airline_management_system.model.CreateNewUserRequest;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component

public class UserUtil {
    public boolean isFirstNameValid(CreateNewUserRequest createNewUserRequest) {
        return (!StringUtils.isEmpty(createNewUserRequest.getFirstName()) && createNewUserRequest.getFirstName().length() <= 30 && createNewUserRequest.getFirstName().matches("^[a-zA-Z]+$"));
    }

    public boolean isLastNameValid(CreateNewUserRequest createNewUserRequest) {
        return (!StringUtils.isEmpty(createNewUserRequest.getLastName()) && createNewUserRequest.getLastName().length() <= 30 && createNewUserRequest.getLastName().matches("^[a-zA-Z]+$"));
    }

    public boolean isPhoneNumberValid(CreateNewUserRequest createNewUserRequest) {
        return (!StringUtils.isEmpty(createNewUserRequest.getPhoneNumber()) && createNewUserRequest.getPhoneNumber().length() == 10 && createNewUserRequest.getPhoneNumber().matches("^[0-9]+$"));
    }

    public boolean isEmailIdValid(CreateNewUserRequest createNewUserRequest) {
        return (!StringUtils.isEmpty(createNewUserRequest.getEmailId()) && createNewUserRequest.getEmailId().length() <= 30 && createNewUserRequest.getEmailId().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"));
    }

    public boolean isTypeValid(CreateNewUserRequest createNewUserRequest) {
        return !StringUtils.isEmpty(createNewUserRequest.getUserType()) && (createNewUserRequest.getUserType().equalsIgnoreCase("admin") || createNewUserRequest.getUserType().equalsIgnoreCase("user"));
    }

}
