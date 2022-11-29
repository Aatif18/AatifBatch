package com.classandobject;

import java.util.Scanner;

public class Employee1 {

	int id;
	String name;
	String dept;
	int salary;
	long contact;
	String email;

	void setData(int i, String n, String d, int s, long c, String e) {

		id = i;
		name = n;
		dept = d;
		salary = s;
		contact = c;
		email = e;

	}

	void display() {

		System.out.println(id + " " + name + " " + dept + " " + salary + " " + contact + " " + email);
	}

	/*
	 * public String toString() { return id + " " + name + " " + dept + " " + salary
	 * + " " + contact + " " + email; }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id :");
		int ids = sc.nextInt();
		System.out.println("Enter name :");
		String names = sc.next();
		System.out.println("Enter department :");
		String depts = sc.next();
		System.out.println("Enter salary :");
		int salarys = sc.nextInt();
		System.out.println("Enter contact :");
		long cont = sc.nextLong();
		System.out.println("Enter email");
		String emails = sc.next();

		Employee1 e1 = new Employee1();
		e1.setData(ids, names, depts, salarys, cont, emails);

		System.out.println("Enter id :");
		ids = sc.nextInt();
		System.out.println("Enter name :");
		names = sc.next();
		System.out.println("Enter department :");
		depts = sc.next();
		System.out.println("Enter salary :");
		salarys = sc.nextInt();
		System.out.println("Enter contact :");
		cont = sc.nextLong();
		System.out.println("Enter email");
		emails = sc.next();

		Employee1 e2 = new Employee1();
		e2.setData(ids, names, depts, salarys, cont, emails);

		System.out.println("Enter id :");
		ids = sc.nextInt();
		System.out.println("Enter name :");
		names = sc.next();
		System.out.println("Enter department :");
		depts = sc.next();
		System.out.println("Enter salary :");
		salarys = sc.nextInt();
		System.out.println("Enter contact :");
		cont = sc.nextLong();
		System.out.println("Enter email");
		emails = sc.next();
		
		Employee1 e3 = new Employee1();
		e3.setData(ids, names, depts, salarys, cont, emails);
		
		System.out.println("Enter id :");
		ids = sc.nextInt();
		System.out.println("Enter name :");
		names = sc.next();
		System.out.println("Enter department :");
		depts = sc.next();
		System.out.println("Enter salary :");
		salarys = sc.nextInt();
		System.out.println("Enter contact :");
		cont = sc.nextLong();
		System.out.println("Enter email");
		emails = sc.next();
		
		
		Employee1 e4 = new Employee1();
		e4.setData(ids, names, depts, salarys, cont, emails);
		
		//System.out.println(e4);
		
		  e1.display();
		  e2.display(); 
		  e3.display(); 
		  e4.display();
		 
	}

}
