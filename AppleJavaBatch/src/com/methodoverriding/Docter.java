package com.methodoverriding;

public class Docter extends Person {
	int id,lisencenumber;
	String spicialization;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setLisencenumber(int lisencenumber) {
		this.lisencenumber = lisencenumber;
	}

	public void setSpicialization(String spicialization) {
		this.spicialization = spicialization;
	}

	void display() {
		super.display();
		System.out.println("Docter Id :"+id);
		System.out.println("Docter Lisence Number : "+lisencenumber);
		System.out.println("Docter Specialization :"+spicialization);
	}
	
}
