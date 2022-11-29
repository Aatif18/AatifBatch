package com.inheritanceassignment;

import com.inheritancepractice.Student1;

public class Depertment {
	int id1;
	String name1;
	Student s;
	
	Depertment(int id1,String name1,int rollno,String name)
	{
		this.id1=id1;
		this.name1=name1;
		this.s=s;
		
		s=new Student(rollno,name);
		
	}
	public String toString() {
		return "Depertment id :"+id1+"\nDepertment Name :"+name1+"\nStudent :"+s;
	}
}
