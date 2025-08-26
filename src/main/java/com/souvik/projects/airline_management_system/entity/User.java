package com.souvik.projects.airline_management_system.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "user")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private String userId;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_phoneNumber")
    private String phoneNumber;

    @Column(name = "user_emailId")
    private String emailId;

    @Column(name = "user_type")
    private UserType userType;
}
