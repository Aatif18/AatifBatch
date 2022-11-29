package com.constructor;

public class Employee1 {
	
	int id;
	String name;
	float pf;
	
	Employee1(){
		id=101;
		name="Aatif";
		pf=452.50f;
	}
	
	
	void show()
	{
		System.out.println("id :"+id+" Name is :"+name+" pf is :"+pf);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e = new Employee1();
		e.show();
	}

}
