package com.amazon.device.iap.model;

/**
 * Created by alexandre on 05/12/17.
 */

public class UserDataResponse {
    public int getRequestStatus() {
        return 0;
    }

    public UserData getUserData() {
        return null;
    }

    public static class RequestStatus{
        public static final int SUCCESSFUL = 0;
    }
}
