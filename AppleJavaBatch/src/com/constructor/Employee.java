package com.constructor;

public class Employee {
	int id;
	String name;
	 Employee(){
		 
	 }
	void show() {
		System.out.println("id :"+id+"\nname is :"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.show();
	}

}
