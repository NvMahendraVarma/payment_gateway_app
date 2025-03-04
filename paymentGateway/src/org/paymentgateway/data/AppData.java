package org.paymentgateway.data;

import org.paymentgateway.entities.UserDetails;

import java.util.ArrayList;
import java.util.List;

public class AppData {

    public static List<UserDetails> usersList = new ArrayList();
    public static UserDetails loggedUser;

    public static List<UserDetails> initUsers() {
        usersList = new ArrayList<>();
        return usersList;
    }

    public static List<UserDetails> getUsersList() {
        return usersList;
    }

    public static void setUsersList(List<UserDetails> usersList) {
        AppData.usersList = usersList;
    }

    public static UserDetails getLoggedUser() {
        return loggedUser;
    }

    public static void setLoggedUser(UserDetails loggedUser) {
        AppData.loggedUser = loggedUser;
    }
}