package com.appsdeveloperblog.ws.mobileappws.userservice;

import com.appsdeveloperblog.ws.mobileappws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.ws.mobileappws.ui.model.response.UserRest;

public interface UserService {

    UserRest createUser(UserDetailsRequestModel userDetails);
}
