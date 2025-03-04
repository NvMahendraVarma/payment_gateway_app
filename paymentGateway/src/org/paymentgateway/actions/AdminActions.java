package org.paymentgateway.actions;

import java.util.Scanner;

import org.paymentgateway.actioninterfaces.AdminInter;
import org.paymentgateway.data.AppData;
import org.paymentgateway.entities.UserDetails;

public class AdminActions implements AdminInter {
    public void displayUsers() {
        System.out.println("User details:");
        if (AppData.getUsersList() == null) {
            System.out.println("There are no registered users");
        } else {
            for (UserDetails user : AppData.getUsersList()) {
                System.out.println(user);
            }
        }
    }
    
    public static void adminOperations(Scanner sc) {
        while (true) {
            System.out.println("Admin Login");
            System.out.println("Enter your password:");
            String pwd = sc.nextLine();
            if (pwd.equals("1234")) {
                AdminActions admin = new AdminActions();
                admin.displayUsers();
                break;
            } else {
                System.out.println("Enter correct password");
            }
        }
    }
    
    public static void main(String[]args) {
    	  Scanner sc = new Scanner(System.in);
          adminOperations(sc);
          sc.close(); 
    }
}