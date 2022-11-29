package com.methodoverriding;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Docter d = new Docter();
		System.out.println("--------------*****Docter Details******------------------");
		d.setAge(25);
		d.setContact("7000978537");
		d.setGender("Male");
		d.setId(101);
		d.setName("Dr Aatif");
		d.setLisencenumber(0221);
		d.setSpicialization("Heart Specialist");
		d.display();
		System.out.println("------------------*****Patient Details******--------------");
		Patient p = new Patient();
		p.setAge(35);
		p.setBadno(501);
		p.setContact("9926486183");
		p.setDisease("Heart Problem");
		p.setGender("Male");
		p.setId(201);
		p.setName("Saif");
		p.display();
	}

}
