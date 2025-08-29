package com.souvik.projects.airline_management_system.validator;

import com.souvik.projects.airline_management_system.model.ErrorAMS;
import com.souvik.projects.airline_management_system.model.CreateNewUserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class ValidateUser {

    @Autowired
    private UserUtil userUtil;

    public void validateUserDetailsWhileCreation(CreateNewUserRequest createNewUserRequest, List<ErrorAMS> errorAMSList) {
        log.info("Validation started ...");
        if(!userUtil.isFirstNameValid(createNewUserRequest)) {
            errorAMSList.add(ErrorAMS.builder()
                    .errorCode("AMS-1001")
                    .errorMessage("Invalid First-Name")
                    .build());
        }

        if(!userUtil.isLastNameValid(createNewUserRequest)) {
            errorAMSList.add(ErrorAMS.builder()
                    .errorCode("AMS-1002")
                    .errorMessage("Invalid Last-Name")
                    .build());
        }

        if(!userUtil.isPhoneNumberValid(createNewUserRequest)) {
            errorAMSList.add(ErrorAMS.builder()
                    .errorCode("AMS-1003")
                    .errorMessage("Invalid Phone Number")
                    .build());
        }

        if(!userUtil.isEmailIdValid(createNewUserRequest)) {
            errorAMSList.add(ErrorAMS.builder()
                    .errorCode("AMS-1004")
                    .errorMessage("Invalid Email Id")
                    .build());
        }

        if(!userUtil.isTypeValid(createNewUserRequest)) {
            errorAMSList.add(ErrorAMS.builder()
                    .errorCode("AMS-1005")
                    .errorMessage("Invalid Type")
                    .build());
        }
        log.info("Validation completed ...");
    }
}
