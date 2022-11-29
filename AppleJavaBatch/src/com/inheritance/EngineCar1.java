package com.inheritance;

public class EngineCar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine1 e1 = new Engine1(2015, 5, "petrol");
		//e1.display();
		//System.out.println("--------------***********----------------");
		Car1 c = new Car1(950000,"White","Zest",e1);
		c.display();
		//System.out.println(c);
	}

}
