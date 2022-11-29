package com.cantrolstatementprogram;

public class Employee {
	
	int id;
	String name;
	String dept;
	int salary;
	long contact;
	String email;
	
	void setData(int i,String n,String d,int s,long c,String e) {
		
		id=i;
		name=n;
		dept=d;
		salary=s;
		contact=c;
		email=e;
		
	}
	
	void display() {
		
		System.out.println(id+" "+name+" "+dept+" "+salary+" "+contact+" "+email);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setData(101, "Aatif", "Mechanical",45000 , 7000978597l, "khanaatif@gmail.com");
		Employee e2 = new Employee();
		e2.setData(102, "saif", "civil", 50000, 1122334455l,"saif@gmail.com");
		Employee e3 = new Employee();
		e3.setData(103,"Faraz","Computer", 41000, 2233445566l,"faraz@gmail.com");
		Employee e4 = new Employee();
		e4.setData(104,"Arsh","Electronic",65000,4455667788l,"arsh@gmail.com");
		Employee e5 = new Employee();
		e5.setData(105,"Aman","Electrical",35000,5566778899l,"aman@gmail.com");
		
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
		
		
	}

}
