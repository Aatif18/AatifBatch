package com.inheritancepractice;

public class Depertment1 {
	int id1;
	String name1;
	Student1 s;
	
	Depertment1(int id1,String name1,int rollno,String name)
	{
		this.id1=id1;
		this.name1=name1;
		this.s=s;
		
		s=new Student1(rollno,name);
		
	}
	public String toString() {
		return "Depertment id :"+id1+"\nDepertment Name :"+name1+"\nStudent :"+s;
	}
}
