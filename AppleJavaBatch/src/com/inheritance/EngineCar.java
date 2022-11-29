package com.inheritance;

public class EngineCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e = new Engine();
		e.setFuelType("petrol");
		e.setNumberOfGear(5);
		e.setProductionYear(2015);
		e.display();
		System.out.println("------------****------------");
		Car c = new Car();
		c.setColour("White");
		c.setName("Zest");
		c.setPrice(950000);
		c.setE(e);
		c.display();
		
	}

}
