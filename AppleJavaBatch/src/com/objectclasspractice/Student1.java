package com.objectclasspractice;

import java.util.Scanner;

public class Student1 {
	int id;
	String name;
	
	void data()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a id :");
		id=sc.nextInt();
		System.out.println("Enter a name");
		name=sc.next();
	}
	void display()
	{
		System.out.println("Student id :"+id+"\nStudent name :"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1();
		s.data();
		s.display();
	}

}
