package com.classandobject;

public class Employee4 {
	int id;
	String name;
	
	void setData(int i,String n) {
		id=i;
		name=n;
		
	}
	void display() {
		System.out.println("Enter id :"+id+" Enter name :"+name);
		//System.out.println("Enter name :"+name);
	}
	
	public String toString() {
		
		return "Enter id :"+id+" Enter name :"+name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee4  e = new Employee4();
		e.setData(101,"Aatif");
		System.out.println(e);
	
	}

}
