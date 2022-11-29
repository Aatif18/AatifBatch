package com.classandobject;

import java.util.Scanner;

public class Employee5 {
	int id;
	String name;
	String dept;
	int salary;
	
	Employee5(int id ,String name,String dept,int salary){
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	void show() {
		System.out.println("Employee id :"+id+"\nEmployee name :"+name+"\nEmployee dept :"+dept+"\nEmployee salary :"+salary);
	}
	public String toString() {
		return "Employee id :"+id+"\nEmployee name :"+name+"\nEmployee dept :"+dept+"\nEmployee salary :"+salary;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee id :");
		int id = sc.nextInt();
		System.out.println("Enter a Employee name :");
		String name=sc.next();
		System.out.println("Enter a dept :");
		String dept=sc.next();
		System.out.println("Enter a Employee salary :");
		int salary=sc.nextInt();
		Employee5 e = new Employee5(id,name,dept,salary);
		System.out.println(e);
		
	}

}
