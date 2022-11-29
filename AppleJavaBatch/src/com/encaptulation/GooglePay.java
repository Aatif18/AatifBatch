package com.encaptulation;

import java.util.Scanner;

public class GooglePay {

	void withDraw(int amount, Account a1) {

		int accbalance = a1.getBalance();
		if (accbalance > amount) {
			accbalance = accbalance - amount;
			a1.setBalance(accbalance);
		} else {
			System.out.println("Low balance !!!");
		}
	}

	void diposite(int amount, Account a1) {
		int accbalance = a1.getBalance();
		accbalance = accbalance + amount;
		a1.setBalance(accbalance);

	}

	public static void main(String[] args) {

		Account a = new Account();
		a.setId(101);
		a.setAccno(112211);
		a.setBalance(25000);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw ");
		int amnt = sc.nextInt();

		GooglePay g = new GooglePay();
		g.withDraw(amnt, a);
		System.out.println("Amount Withdraw ; Total balance :" + a.getBalance());
		
		
		Account a1 = new Account();
		a1.setId(102);
		a1.setBalance(50000);
		a1.setAccno(112233);
		System.out.println("Enter the amount Diposite :");
		int dipo=sc.nextInt();
		g.diposite(dipo, a1);
		System.out.println("Amount Diposite ; Total Balance :" +a1.getBalance());

	}
}
