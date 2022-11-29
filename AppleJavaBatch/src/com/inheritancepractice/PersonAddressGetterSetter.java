package com.inheritancepractice;

public class PersonAddressGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressGetterSetter a2 = new AddressGetterSetter();
		a2.setPincode(481001);
		a2.setArea("Frinds Colony");
		a2.setCity("Nagpur");
		a2.setState("Maharastra");
	
		
		
		PersonGetterSetter p1 = new PersonGetterSetter();
		p1.setId(101);
		p1.setName("Aatif Aslam");
		p1.setContact("9926486183");
		p1.setEmail("aatif@gmail.com");
		p1.setA(a2);
		System.out.println(p1);
		
	}

}
