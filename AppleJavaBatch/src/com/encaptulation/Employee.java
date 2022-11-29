package com.encaptulation;

public class Employee {

	private int id, salary;
	private String name, dept ;
	private long contact;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public long getContact() {
		return contact;
	}

}
