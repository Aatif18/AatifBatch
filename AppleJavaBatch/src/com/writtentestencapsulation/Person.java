package com.writtentestencapsulation;

public class Person {
	private int age;
	private String gender, name, address;
	Address a;

	Person(int age, String gender, String name, String address, Address a) {
		this.age = age;
		this.gender = gender;
		this.name = name;
		this.address = address;
		this.a = a;

		// a = new Address(city, state, country);

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Address getA() {
		return a;
	}

	public void setA(Address a) {
		this.a = a;
	}

	void personData() {
		System.out.println("Person Age :" + age);
		System.out.println("Person Gender :" + gender);
		System.out.println("Person Name :" + name);
		System.out.println("Person Address :" + address);
		System.out.println("" + a);
	}

	/*
	 * public String toString() { return "Person Age :" + age + "\nPerson Gender :"
	 * + gender + "\nPerson Name :" + name + "\nPerson Address :" + address + "" +
	 * a; }
	 */
}
