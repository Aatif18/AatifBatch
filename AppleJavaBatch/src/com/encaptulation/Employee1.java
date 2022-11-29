package com.encaptulation;

public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setId(101);
		e.setName("Atif");
		e.setDept("Mechanical");
		e.setSalary(45000);
		e.setContact(7000978537l);
		System.out.println("Employee id : "+e.getId());
		System.out.println("Employee Name: "+e.getName());
		System.out.println("Employee Department : "+e.getDept());
		System.out.println("Employee Salary : "+e.getSalary());
		System.out.println("Employee Contact : "+e.getContact());
		Employee e2 = new Employee();
		e.setId(102);
		e.setName("Aslam");
		e.setDept("Civil");
		e.setSalary(35000);
		e.setContact(9926486183l);
		System.out.println("Employee id :"+e.getId());
	}

}
