package com.methodoverriding;

public class Person {
	int age ;
	String contact , gender , name;
	
	public void setAge(int age) {
		this.age = age;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	void display() {
		
		System.out.println("Person Name :"+name);
		System.out.println("Person Age :"+age);
		System.out.println("Person Contact :"+contact);
		System.out.println("Person Gender :"+gender);
		
		
	}
}
