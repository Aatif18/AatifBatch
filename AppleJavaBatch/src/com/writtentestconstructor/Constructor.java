package com.writtentestconstructor;

public class Constructor {

	int id;
	String name;
	int salary;
	
	Constructor(int i,String n,int s){
		id=i;
		name=n;
		salary=s;
	}
	Constructor(Constructor c)
	{
		id=c.id;
		name=c.name;
		salary=c.salary;
	}
	void display()
	{
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
	}

}
