package org.paymentgateway.actioninterfaces;

import org.paymentgateway.entities.UserDetails;

public interface UserActionsInter {
    void registerUser(UserDetails user);
    void loginUser(UserDetails user);
    UserDetails checkUser(String userName, String password);
}