package com.hopeforhumanity.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetailsPostRequest {

    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String emailId;
    private String streetAddress;
    private String city;
    private String country;
    private double amount;
    private String message;
}
