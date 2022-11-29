package com.inheritancepractice;

public class Student1 {
	int rollno;
	String name;
	
	Student1(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	public String toString() {
		return "Student Roll No"+rollno+"\nStudent Name :"+name;
	}
}
