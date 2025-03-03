package org.paymentgateway.entities;

import org.paymentgateway.enums.AccountStatus;

public class BankAccount {
    private String bankAccountId;
    private String accountNumber;
    private String ifscCode;
    private String bankName;
    private String branch;
    private AccountStatus accountStatus;
    private UserDetails user;
    
	public BankAccount(String bankAccountId, String accountNumber, String ifscCode, String bankName, String branch,
			AccountStatus accountStatus, UserDetails user) {
		super();
		this.bankAccountId = bankAccountId;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.bankName = bankName;
		this.branch = branch;
		this.accountStatus = accountStatus;
		this.user = user;
	}

	public String getBankAccountId() {
		return bankAccountId;
	}

	public void setBankAccountId(String bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}

	public UserDetails getUser() {
		return user;
	}

	public void setUser(UserDetails user) {
		this.user = user;
	}

    
}
