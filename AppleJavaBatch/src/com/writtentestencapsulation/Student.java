package com.writtentestencapsulation;

public class Student {
	private int rollno;
	private String name1;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	
	public String toString() {
		return "Student Roll number :"+rollno+"\nStudent name :"+name1;
	}
	
}
