package com.writtentestencapsulation;

public class PersonAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address("bhopal","MP","India");
		
		Person p =  new Person(25,"male","AAtif","Friends Colony",a);
		
		p.personData();
		
	}

}
