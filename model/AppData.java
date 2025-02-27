package org.paymentgatewaysystem.model;

import java.util.ArrayList;
import java.util.List;

public class AppData {
	
	public static List<UserDetails> usersList;
	public static List<UserDetails> initusers(){
		usersList =new ArrayList<UserDetails>();
		return null;
	}
	
    private static UserDetails loggedUser;

	public static UserDetails getLoggedUser() {
		return loggedUser;
	}

	public static void setLoggedUser(UserDetails loggedUser) {
		AppData.loggedUser = loggedUser;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
