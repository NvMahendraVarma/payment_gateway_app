package org.paymentgateway.main;

import org.paymentgateway.actions.AdminActions;
import org.paymentgateway.actions.UserActions;
import org.paymentgateway.actions.WalletAccountActions;
import org.paymentgateway.data.AppData;
import org.paymentgateway.entities.UserAccountDetails;
import org.paymentgateway.entities.UserDetails;

import java.util.Scanner;

public class PaymentAppMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        userMenu(sc);
        sc.close();  
    }


    public static void userMenu(Scanner sc) {
        UserActions actions = new UserActions();
        UserDetails currentUser = null;
        System.out.println("\n--- User Menu ---");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {
            System.out.println("Enter username:");
            String username = sc.nextLine();

            System.out.println("Enter your password");
            String password = sc.nextLine();

            System.out.print("Enter First Name: ");
            String firstName = sc.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            String phoneNumber = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            currentUser = new UserDetails(userChoice, username, password, firstName, lastName, phoneNumber, email, address, null, null);
            actions.registerUser(currentUser);
            System.out.println("You are registered successfully");

            } 
            else if (choice == 2) {
              System.out.println("Enter username:");
              String username = sc.nextLine();

              System.out.println("Enter your password");
              String password = sc.nextLine();

            currentUser = actions.checkUser(username, password);

            if (currentUser == null) {
                System.out.println("User not found or incorrect password. Exiting...");
                sc.close();
                return;
            }
            actions.loginUser(currentUser);
            System.out.println("Login successful! Welcome, " + currentUser.getUserName());
            userOperations(sc);
        } else {
            System.out.println("Invalid option. Exiting...");
        }
    }

    public static void userOperations(Scanner sc) {
        UserActions actions = new UserActions();
        WalletAccountActions walletActions = new WalletAccountActions();
        while (AppData.getLoggedUser() != null) {
            System.out.println("1. Create wallet account");
            System.out.println("2. View Wallet balance");
            System.out.println("3. Update Wallet balance");
            System.out.println("4. Logout");
            int response = sc.nextInt();
            sc.nextLine();  
            switch (response) {
                case 1:
                    UserAccountDetails userAcc = walletActions.createUserAccount(AppData.getLoggedUser(), sc);
                    AppData.getLoggedUser().setUserAccountDetails(userAcc);
                    break;
                case 2:
                    if (AppData.getLoggedUser().getUserAccountDetails() != null) {
                        System.out.println("Your current wallet balance is: "
                                + AppData.getLoggedUser().getUserAccountDetails().getCurrentWalletBalance());
                    } else {
                        System.out.println("No wallet account found. Please create one first.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the amount you want to add:");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    walletActions.addMoneyToWallet(amount);
                    break;
                case 4:
                    System.out.println("You have been logged out successfully");
                    AppData.setLoggedUser(null);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
