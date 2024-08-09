package com.hopeforhumanity.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetailsResponse {

    private long id;
    private String firstName;
    private String laseName;
    private long phoneNumber;
    private String emailId;
    private String streetAddress;
    private String city;
    private String country;
    private double amount;
    private String message;
}
