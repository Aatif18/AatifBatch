package com.writtentestconstructor;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setId(101);
		e.setName("Aatif");
		e.setSalary(45000);
		e.display();
		
		Employee e1 = new Employee(102,"Aslam",55000);
		e1.display();

	}

}
