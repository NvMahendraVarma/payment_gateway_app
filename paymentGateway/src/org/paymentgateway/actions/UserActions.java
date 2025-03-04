package org.paymentgateway.actions;

import org.paymentgateway.actioninterfaces.UserActionsInter;
import org.paymentgateway.data.AppData;
import org.paymentgateway.entities.UserDetails;

public class UserActions implements UserActionsInter {

    public void registerUser(UserDetails user) {
        AppData.usersList.add(user);
    }

    public void loginUser(UserDetails user) {
        AppData.setLoggedUser(user);
    }

    public UserDetails checkUser(String userName, String password) {
        for (UserDetails user : AppData.getUsersList()) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}