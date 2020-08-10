package com.appsdeveloperblog.ws.mobileappws.ui.model.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserDetailsRequestModel {
    @NotNull(message = "First name cannot be null")
    @Size(min = 2)
    private String firstName;

    @NotNull(message = "Last name cannot be null")
    @Size(min = 2)
    private String lastName;

    @NotNull(message = "Email name cannot be null")
    @Email
    private String email;

    @NotNull(message = "Password cannot be null")
    @Size(min = 8, max = 16, message = "Password must be 8-16 characters")
    private String password;
}
