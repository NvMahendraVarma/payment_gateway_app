package org.paymentgateway.actioninterfaces;

import org.paymentgateway.entities.UserDetails;
import org.paymentgateway.entities.UserAccountDetails;

import java.util.Scanner;

public interface WalletAccountInter {
    void addMoneyToWallet(double amount);
    UserAccountDetails createUserAccount(UserDetails user, Scanner sc);
}