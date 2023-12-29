package com.java.miniProject;

import java.util.Scanner;

public class AccountRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		int typeOfBank;
		String operation;
		String toContinue;
		do{
			System.out.println("Enter 1 for Savings Account");
			System.out.println("Enter 2 for Current Account");
			option = sc.nextInt();
			if(option==1) {
				SavingsAccount s1 = new SavingsAccount();
				System.out.println("Enter 1 for Commercial Bank");
				System.out.println("Enter 2 for Private Bank");
				typeOfBank = sc.nextInt();
				if(typeOfBank==1) {
					double minBalance = s1.getMinimumBalance("Commercial");
					System.out.println("Enter Withdraw for withdrawing the amount");
					System.out.println("Enter Deposit for depositing the amount");
					operation = sc.next();
					if(operation.equalsIgnoreCase("Withdraw")) {
						System.out.println("Enter the amount to withdraw");
						int amount = sc.nextInt();
						System.out.println(s1.withdraw(amount,minBalance));
						}
					else if(operation.equalsIgnoreCase("Deposite")) {
						System.out.println("Enter the amount to deposite");
						int amount = sc.nextInt();
						System.out.println(s1.deposite(amount,minBalance));
					}
					else {
						System.out.println("Please enter the correct option");
					}
				}
				else if(typeOfBank==2) {
					double minBalance = s1.getMinimumBalance("Private");
					System.out.println("Enter Withdraw for withdrawing the amount");
					System.out.println("Enter Deposite for depositing the amount");
					operation = sc.next();
					if(operation.equalsIgnoreCase("Withdraw")) {
						System.out.println("Enter the amount to withdraw");
						int amount = sc.nextInt();
						System.out.println(s1.withdraw(amount,minBalance));
						}
					else if(operation.equalsIgnoreCase("Deposite")) {
						System.out.println("Enter the amount to deposite");
						int amount = sc.nextInt();
						System.out.println(s1.deposite(amount,minBalance));
					}
					else {
						System.out.println("Please enter withdraw or deposit only");
					}
				}
				else {
					System.out.println("Please enter the correct type of bank");
				}
			}
			else if(option==2) {
				CurrentAccount c1 = new CurrentAccount();
				System.out.println("Enter 1 for Commercial Bank");
				System.out.println("Enter 2 for Private Bank");
				typeOfBank = sc.nextInt();
				if(typeOfBank==1) {
					double minBalance = c1.getMinimumBalance("Commercial");
					System.out.println("Enter Withdraw for withdrawing the amount");
					System.out.println("Enter Deposit for depositing the amount");
					operation = sc.next();
					if(operation.equalsIgnoreCase("Withdraw")) {
						System.out.println("Enter the amount to withdraw");
						int amount = sc.nextInt();
						System.out.println(c1.withdraw(amount,minBalance));
						}
					else if(operation.equalsIgnoreCase("Deposite")) {
						System.out.println("Enter the amount to deposite");
						int amount = sc.nextInt();
						System.out.println(c1.deposite(amount,minBalance));
					}
					else {
						System.out.println("Please enter the correct option");
					}
				}
				else if(typeOfBank==2) {
					double minBalance = c1.getMinimumBalance("Private");
					System.out.println("Enter Withdraw for withdrawing the amount");
					System.out.println("Enter Deposit for depositing the amount");
					operation = sc.next();
					if(operation.equalsIgnoreCase("Withdraw")) {
						System.out.println("Enter the amount to withdraw");
						int amount = sc.nextInt();
						System.out.println(c1.withdraw(amount,minBalance));
						}
					else if(operation.equalsIgnoreCase("Deposite")) {
						System.out.println("Enter the amount to deposite");
						int amount = sc.nextInt();
						System.out.println(c1.deposite(amount,minBalance));
					}
					else {
						System.out.println("Please enter withdraw or deposit only");
					}
				}
				else {
					System.out.println("Please enter the correct type of bank");
				}
			}
			else {
				System.out.println("Enter correct option");
			}
			System.out.println("Do you want to continue....Enter yes or no");
			toContinue=sc.next();
		}while(toContinue.equalsIgnoreCase("yes"));
		sc.close();
	}
}
