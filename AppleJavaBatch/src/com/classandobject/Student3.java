package com.classandobject;

import java.util.Scanner;

public class Student3 {
	
	int id;
	String name;
	int marks;
	String dept;
	
	void setData(int i,String n,int m,String d) {
		id=i;
		name=n;
		marks=m;
		dept=d;
	}
	void display() {
		
		System.out.println(id+" "+name+" "+marks+" "+dept);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int ids=sc.nextInt();
		System.out.println("Enter name");
		String names=sc.next();
		System.out.println("Enter marks");
		int markss=sc.nextInt();
		System.out.println("Enter dept");
		String depts=sc.next();
		
		Student3 s1 = new Student3();
		s1.setData(ids, names, markss, depts);
		
		
		System.out.println("Enter id");
		 ids=sc.nextInt();
		System.out.println("Enter name");
		 names=sc.next();
		System.out.println("Enter marks");
		 markss=sc.nextInt();
		System.out.println("Enter dept");
		 depts=sc.next();
		 
		 Student3 s2 = new Student3();
		 s2.setData(ids, names, markss, depts);
		
		 
		 System.out.println("Enter id");
		 ids=sc.nextInt();
		System.out.println("Enter name");
		 names=sc.next();
		System.out.println("Enter marks");
		 markss=sc.nextInt();
		System.out.println("Enter dept");
		 depts=sc.next();
		 
		 Student3 s3 = new Student3();
		 s3.setData(ids, names, markss, depts);
		 
		 System.out.println("Enter id");
		 ids=sc.nextInt();
		System.out.println("Enter name");
		 names=sc.next();
		System.out.println("Enter marks");
		 markss=sc.nextInt();
		System.out.println("Enter dept");
		 depts=sc.next();
		 
		 Student3 s4 = new Student3();
		 s4.setData(ids, names, markss, depts);
		 
		 s1.display();
		 s2.display();
		 s3.display();
		 s4.display();
		 
				
	}

}
