package org.paymentgateway.actions;

import org.paymentgateway.actioninterfaces.AdminInter;
import org.paymentgateway.data.AppData;
import org.paymentgateway.entities.UserDetails;

public class AdminActions implements AdminInter {
    public void displayUsers() {
        System.out.println("User details....");
        if (AppData.getUsersList() == null) {
            System.out.println("There are no users registered yet");
        } else {
            for (UserDetails user : AppData.getUsersList()) {
                System.out.println(user);
            }
        }
    }
}
