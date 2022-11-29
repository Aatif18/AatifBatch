package com.inheritanceisarelationship;

public class Person {
	int id,age;
	String name,contact;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	
	public String toString() {
		return "Person id :" + id + "\n age :" + age + "\nname :" + name + "\ncontact :" + contact + "";
	}
	
}
