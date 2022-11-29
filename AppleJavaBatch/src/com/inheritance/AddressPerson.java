package com.inheritance;

public class AddressPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address(481001,"Raza nagar","balaghat","MP");
		
		Person p1 = new Person(101,"Aatif","9926486183","aatif@gmail.com",a);
		Person p2 = new Person(102,"Saif","7000978537","saif@gmail.com",a);
		Person p3 = new Person(103,"Sheeba","9301125655","sheeba@gmail.com",a);
		System.out.println(p1);
		System.out.println("-----------*********--------------");
		System.out.println(p2);
		System.out.println("-----------*********--------------");
		System.out.println(p3);
		
	}

}
