package com.appsdeveloperblog.ws.mobileappws.exceptions;

public class UserServiceException extends RuntimeException {

    private static final long serialVersionUID = 9029699600223774955L;

    public UserServiceException(String message) {
        super(message);
    }
}
