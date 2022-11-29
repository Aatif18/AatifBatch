package com.inheritance;

public class PersonIdProof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdProof ip = new IdProof();
		ip.setAddress("Bhopal");
		ip.setName("Aatif");
		ip.setNumber(101);
				
		Person1 p = new Person1();
		p.setName("Aatif");
		p.setAge(25);
		p.setContact("7000978537");
		p.setIp(ip);
		System.out.println(p);
		
		
		
	}

}
