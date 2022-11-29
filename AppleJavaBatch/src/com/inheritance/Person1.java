package com.inheritance;

public class Person1 {
	private int age;
	private String name,contact;
	IdProof ip;
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
	public IdProof getIp() {
		return ip;
	}
	public void setIp(IdProof ip) {
		this.ip = ip;
	}
	public String toString() {
		return "Person Age :"+age+"\nPerson Name :"+name+"\nPerson Contact :"+contact+"\n"+ip;
	}
}
