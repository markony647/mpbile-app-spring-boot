package com.appsdeveloperblog.ws.mobileappws.userservice.impl;

import com.appsdeveloperblog.ws.mobileappws.shared.Utils;
import com.appsdeveloperblog.ws.mobileappws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.ws.mobileappws.ui.model.response.UserRest;
import com.appsdeveloperblog.ws.mobileappws.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private Map<String, UserRest> users;
    private Utils utils;

    @Autowired
    public UserServiceImpl(Utils utils) {
        this.utils = utils;
    }

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();
        returnValue.setFirstName(userDetails.getFirstName());
        returnValue.setLastName(userDetails.getLastName());
        returnValue.setEmail(userDetails.getEmail());

        String userId = utils.generateUserId();
        returnValue.setUserId(userId);
        if (this.users == null) {
            this.users = new HashMap<>();
            this.users.put(userId, returnValue);
        }
        return returnValue;
    }
}
