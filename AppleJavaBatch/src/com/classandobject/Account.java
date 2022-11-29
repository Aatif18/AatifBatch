package com.classandobject;

public class Account {
	int accno;
	String name;
	float balance;

	void openAccount(int a, String n, float b) {
		accno = a;
		name = n;
		balance = b;
	}

	void showAccountDetail() {
		System.out.println("Accont no. :" + accno);
		System.out.println("Customer Name :" + name);
		System.out.println("Account Balance :"+balance);
	}
	public String toString() {
		return "Account Balance :"+balance;
	}

	public static void main(String[] args) {
		Account ac = new Account();
		ac.openAccount(121, "Aatif", 452540f);
		System.out.println(ac);
		//ac.showAccountDetail();

	}
}
