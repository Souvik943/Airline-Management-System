package com.souvik.projects.airline_management_system.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateNewUserRequest {
    String firstName;
    String lastName;
    String phoneNumber;
    String emailId;
    String userType;
}
