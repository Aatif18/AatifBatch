package com.inheritancepractice;

public class PersonAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1 = new Address(481001,"Raza Nagar","Balaghat","M.P");
		Person p1 = new Person(101,"Aatif","7000978537","aatif@gmail.com",a1);
		System.out.println(p1);
	}

}
