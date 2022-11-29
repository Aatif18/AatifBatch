package com.inheritanceassignment;

public class Student {
	int rollno;
	String name;
	
	Student(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public String toString() {
		return "Student Roll No"+rollno+"\nStudent Name :"+name;
	}
}
