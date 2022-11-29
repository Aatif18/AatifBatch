package com.objectclasspractice;

public class Account {
	/*
	 * Create a class Account containing following methods - insert () to insert
	 * account data display () to 
	 * display account information deposit () to deposit
	 * amount withdraw () to withdraw amount check_balance() to check balance
	 */
	int accno;
	String name;
	String ifsccode;
	String branch;
	int amount;
	void insert(int a,String n,String i,String b)
	{
		accno=a;
		name=n;
		ifsccode=i;
		branch=b;
		
	}
	void display() {
		System.out.println("Account no :"+accno);
		System.out.println("Name is :"+name);
		System.out.println("Bank ifsccode :"+ifsccode);
		System.out.println("Branch name :"+branch);
		
	}
	void deposit(int a){
		amount=a;
	}
	void withdraw() {
		
	}
	void checkBalance() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.insert(12345,"Aatif","12A12","Pune");
		a.display();
	}

}
