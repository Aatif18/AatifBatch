package com.constructor;

import java.util.Scanner;

public class Employee2 {
	int id;
	String name;
	String dept;
	int salary;
	float pf;

	Employee2(int i, String n, String d, int s, float p) {
		id = i;
		name = n;
		dept = d;
		salary = s;
		pf = p;

	}

	void show() {
		System.out
				.println("id" + id + "name is :" + name + "dept is :" + dept + "salary is :" + salary + "pf is :" + pf);
	}

	public String toString() {
		return "id" + id + "name is :" + name + "dept is :" + dept + "salary is :" + salary + "pf is :" + pf;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a id :");
		int id = sc.nextInt();
		System.out.println("Enter a Name :");
		String name = sc.next();
		System.out.println("Enter a department :");
		String dept = sc.next();
		System.out.println("Enter a Salary :");
		int salary = sc.nextInt();
		System.out.println("Enter a pf :");
		float pf = sc.nextFloat();
		Employee2 e1 = new Employee2(id, name, dept, salary, pf);
		System.out.println(e1);

		// Employee2 e2 = new Employee2(id,name,dept,salary,pf);
		// System.out.println(e2);
		System.out.println("Enter a id :");
		id = sc.nextInt();
		System.out.println("Enter a Name :");
		name = sc.next();
		System.out.println("Enter a department :");
		dept = sc.next();
		System.out.println("Enter a Salary :");
		salary = sc.nextInt();
		System.out.println("Enter a pf :");
		pf = sc.nextFloat();
		Employee2 e2 = new Employee2(id, name, dept, salary, pf);
		System.out.println(e2);

	}

}
