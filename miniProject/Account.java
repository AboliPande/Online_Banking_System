package com.java.miniProject;

public interface Account {
	double getMinimumBalance(String str);
	String withdraw(double amount, double minBalance);
	String deposite(double amount,double minBalance);
}