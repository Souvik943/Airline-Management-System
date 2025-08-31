package com.souvik.projects.airline_management_system.validator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component

public class UserUtil {
    public boolean isFirstNameValid(String firstName) {
        return (!StringUtils.isEmpty(firstName) && firstName.length() <= 30 && firstName.matches("^[a-zA-Z]+$"));
    }

    public boolean isLastNameValid(String lastName) {
        return (!StringUtils.isEmpty(lastName) && lastName.length() <= 30 && lastName.matches("^[a-zA-Z]+$"));
    }

    public boolean isPhoneNumberValid(String phoneNumber) {
        return (!StringUtils.isEmpty(phoneNumber) && phoneNumber.length() == 10 && phoneNumber.matches("^[0-9]+$"));
    }

    public boolean isEmailIdValid(String emailId) {
        return (!StringUtils.isEmpty(emailId) && emailId.length() <= 30 && emailId.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"));
    }

    public boolean isTypeValid(String userTpe) {
        return !StringUtils.isEmpty(userTpe) && (userTpe.equalsIgnoreCase("admin") || userTpe.equalsIgnoreCase("user"));
    }

}
