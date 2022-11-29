package com.writtentestencapsulation;

public class DepertmentStudent {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setRollno(1);
		s.setName1("Aatif");
		
		Department d = new Department();
		d.setId(101);
		d.setName("Mechanical");
		d.setS(s);
		
		
		System.out.println(d);
	}

}
