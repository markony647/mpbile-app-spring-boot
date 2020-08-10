package com.appsdeveloperblog.ws.mobileappws.ui.model.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UpdateUserDetailsRequestModel {
    @NotNull(message = "First name cannot be null")
    @Size(min = 2)
    private String firstName;

    @NotNull(message = "Last name cannot be null")
    @Size(min = 2)
    private String lastName;
}
