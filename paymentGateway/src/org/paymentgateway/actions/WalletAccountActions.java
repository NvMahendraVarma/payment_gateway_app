package org.paymentgateway.actions;

import org.paymentgateway.actioninterfaces.WalletAccountInter;
import org.paymentgateway.data.AppData;
import org.paymentgateway.entities.UserDetails;
import org.paymentgateway.entities.UserAccountDetails;

import java.util.Date;
import java.util.Scanner;

public class WalletAccountActions implements WalletAccountInter {

    @Override
    public UserAccountDetails createUserAccount(UserDetails user, Scanner sc) {
        Date accountOpenDate = new Date();

        System.out.print("Enter wallet PIN: ");
        String walletPin = sc.nextLine();

        System.out.print("Enter initial wallet balance: ");
        double initialBalance = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter number of linked accounts: ");
        int linkedAccountsCount = sc.nextInt();
        sc.nextLine();

        UserAccountDetails userAccountDetails = new UserAccountDetails(linkedAccountsCount, accountOpenDate, initialBalance, linkedAccountsCount, walletPin, user);
        return userAccountDetails;
    }

    @Override
    public void addMoneyToWallet(double amount) {
        if (AppData.getLoggedUser().getUserAccountDetails() != null) {
            UserAccountDetails userAccountDetails = AppData.getLoggedUser().getUserAccountDetails();
            double newBalance = userAccountDetails.getCurrentWalletBalance() + amount;
            userAccountDetails.setCurrentWalletBalance(newBalance);
            System.out.println("Money added successfully. New balance: " + newBalance);
        } else {
            System.out.println("Please create a wallet account first.");
        }
    }
}