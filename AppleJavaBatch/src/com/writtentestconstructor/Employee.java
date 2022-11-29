package com.writtentestconstructor;

public class Employee {
	
	private int id,salary;
	private String name;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	Employee(){
		System.out.println("This is default constructor :");
	}
	Employee(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		System.out.println("This is perameterized constructor :");
	}
	void display() {
		System.out.println("Employee id :"+id);
		System.out.println("Employee Name :"+name);
		System.out.println("Employee Salary :"+salary);
	}
	
	
}
