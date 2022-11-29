package com.writtentestconstructor;

public class ConstructerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c =  new Constructor(101,"Aatif",50000);
		c.display();
		Constructor c1 = new Constructor(c);
		c1.display();
	}

}
