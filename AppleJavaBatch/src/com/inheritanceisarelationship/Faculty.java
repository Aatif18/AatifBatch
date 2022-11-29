package com.inheritanceisarelationship;

public class Faculty extends Person {
	String subject;
	int salary;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	void pf() {
		System.out.println("pf salary :"+(salary*.15));
	}
	
	public String toString() {
		return "Faculty subject :" + subject + "\nsalary :" + salary + "";
	}
	
}
