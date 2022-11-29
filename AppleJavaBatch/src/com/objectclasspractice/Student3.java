package com.objectclasspractice;

import java.util.Scanner;

public class Student3 {
	/*
	 * Create getId() method in Student class. call getId() method from displayData
	 * method so that you know that one method can be called from another method.
	 * Return id from getId() method and set that id to the instance variable in
	 * displayData method.
	 */
	int id;
	String name;
	int getId(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id :");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		return id;
	
		
	}
	void display() {
		
		System.out.println("id :"+id+"\nName :"+name);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 s = new Student3();
	    int id=s.getId();
		s.display();
	}

}
