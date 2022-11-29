package com.methodoverriding;

public class Patient extends Person {
	int id,badno;
	String disease;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setBadno(int badno) {
		this.badno = badno;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	void display()
	{
		super.display();
		System.out.println("Patient is :"+id);
		System.out.println("Patient Bad number :"+badno);
		System.out.println("Patient Diesease :"+disease);
	}
}
