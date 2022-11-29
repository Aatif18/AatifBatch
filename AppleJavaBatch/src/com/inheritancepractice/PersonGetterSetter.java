package com.inheritancepractice;

public class PersonGetterSetter {
	private int id;
	private String name,contact,email;
	AddressGetterSetter a;
	
	
	
	
	public AddressGetterSetter getA() {
		return a;
	}
	public void setA(AddressGetterSetter a) {
		this.a = a;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return "Person Id :"+id+"\nPerson Name :"+name+"\nPerson Contact :"+contact+"\nPerson Email :"+email+"\nAddress :"+a;
	}
	
}
