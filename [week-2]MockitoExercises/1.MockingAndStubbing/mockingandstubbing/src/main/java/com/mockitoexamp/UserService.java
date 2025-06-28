package com.mockitoexamp;

public class UserService {
    private final UserServiceAPI userServiceAPI;

    public UserService(UserServiceAPI userServiceAPI) {
        this.userServiceAPI = userServiceAPI;
    }

    public String fetchUserDetails(String userId) {
        return userServiceAPI.getUserDetails(userId);
    }
}
