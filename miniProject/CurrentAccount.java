package com.java.miniProject;

public class CurrentAccount implements Account{
	double balance = Math.random()*1000;

	@Override
	public double getMinimumBalance(String str) {
		if(str.equalsIgnoreCase("Commercial")) {
			int minBalance = 1000;
			return minBalance;
			}
			else{
				double minBalance = 6000;
				return minBalance;
			}
	}

	@Override
	public String withdraw(double amount, double minBalance) {
		if(balance>minBalance && amount<balance) {
			System.out.println("Current balance in your account is "+balance);
			double currentBalance = balance - amount;
			System.out.println("Current balance in your account after withdrawing is "+currentBalance);
			return "You have withdrawn the amount successfully" ;
		}
		else {
			System.out.println("Current balance in your account is "+balance);
			return "You cannot withdraw the amount ............Insufficient Balance";
		}
	}

	@Override
	public String deposite(double amount, double minBalance) {
		if(balance<minBalance) {
			System.out.println("Current balance in your account is "+balance);
			double extraAmount = minBalance-balance;
			double totalAmount = amount+extraAmount;
			System.out.println("Total Amount to deposit is "+totalAmount);
			double currentBalance = totalAmount+balance;
			System.out.println("Current balance remaining in your account after depositing is "+currentBalance);
			return "You have successfully deposited the amount";
		}
		else {
			System.out.println("Current balance in your account is "+balance);
			System.out.println("Current balance in your account after depositing is "+amount);
			return "You have successfully deposited the amount";
		}
	}
}