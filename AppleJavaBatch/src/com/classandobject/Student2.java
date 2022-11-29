package com.classandobject;

import java.util.Scanner;

public class Student2 {

	int id;
	String name;
	int marks;
	String dept;

	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a id :");
		id = sc.nextInt();
		System.out.println("Enter a Name :");
		name = sc.next();
		System.out.println("Enter a marks :");
		marks = sc.nextInt();
		System.out.println("Enter a dept :");
		dept = sc.next();
	}

	void display() {
		System.out.println(id + " " + name + " " + marks + " " + dept);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1 = new Student2();
		s1.setData();
		// Student2 s2 = new Student2();
		// s2.setData();
		// Student2 s3 = new Student2();
		// s3.setData();

		s1.display();
		// s2.display();
		// s3.display();
	}

}
