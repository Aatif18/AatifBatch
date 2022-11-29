package com.inheritance;

public class IdProof {
	private int number;
	private String name,address;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
	public String toString() {
		return "Person Number :"+number+"\nPerson Name :"+name+"\nPerson Address :"+address;
	}
	
}
