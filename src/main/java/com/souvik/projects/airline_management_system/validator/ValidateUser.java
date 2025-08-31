package com.souvik.projects.airline_management_system.validator;

import com.souvik.projects.airline_management_system.entity.User;
import com.souvik.projects.airline_management_system.model.ErrorAMS;
import com.souvik.projects.airline_management_system.model.CreateNewUserRequest;
import com.souvik.projects.airline_management_system.model.GetUserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class ValidateUser {

    @Autowired
    private UserUtil userUtil;

    public void validateUserDetailsWhileCreation(CreateNewUserRequest createNewUserRequest, List<ErrorAMS> errorAMSList, Map<String, User> allUsers) {
        log.info("Validation started ...");
        if(!userUtil.isFirstNameValid(createNewUserRequest.getFirstName())) {
            errorAMSList.add(ErrorAMS.builder()
                    .errorCode("AMS-1001")
                    .errorMessage("Invalid First-Name")
                    .build());
        }

        if(!userUtil.isLastNameValid(createNewUserRequest.getLastName())) {
            errorAMSList.add(ErrorAMS.builder()
                    .errorCode("AMS-1002")
                    .errorMessage("Invalid Last-Name")
                    .build());
        }

        if(!userUtil.isPhoneNumberValid(createNewUserRequest.getPhoneNumber())) {
            errorAMSList.add(ErrorAMS.builder()
                    .errorCode("AMS-1003")
                    .errorMessage("Invalid Phone Number")
                    .build());
        }

        if(!userUtil.isEmailIdValid(createNewUserRequest.getEmailId())) {
            errorAMSList.add(ErrorAMS.builder()
                    .errorCode("AMS-1004")
                    .errorMessage("Invalid Email Id")
                    .build());
        }

        if(!userUtil.isTypeValid(createNewUserRequest.getUserType())) {
            errorAMSList.add(ErrorAMS.builder()
                    .errorCode("AMS-1005")
                    .errorMessage("Invalid Type")
                    .build());
        }

        if(allUsers.containsKey(createNewUserRequest.getEmailId())) {
            errorAMSList.add(ErrorAMS.builder()
                    .errorCode("AMS-1006")
                    .errorMessage("User With Email already exists")
                    .build());
        }
        log.info("Validation completed ...");
    }

    public void validateUserDetailsWhileGetting(GetUserRequest getUserRequest, List<ErrorAMS> errorAMSList) {
        if(!userUtil.isEmailIdValid(getUserRequest.getEmailId())) {
            errorAMSList.add(ErrorAMS.builder()
                    .errorCode("AMS-1004")
                    .errorMessage("Invalid Email Id")
                    .build());
        }
    }
}
