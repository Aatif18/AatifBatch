package com.inheritance;

public class Engine1 {

	int productionYear, numberOfGear;
	String fuelType;

	Engine1(int productionYear, int numberOfGear, String fuelType) {
		this.productionYear = productionYear;
		this.numberOfGear = numberOfGear;
		this.fuelType = fuelType;
	}

	void display() {
		System.out.println("Engine productionYear :" + productionYear+"\nEngine numberOfGear :" + numberOfGear+"\nEngine fuelType :" + fuelType);
		/*
		 * System.out.println("Engine numberOfGear :" + numberOfGear);
		 * System.out.println("Engine fuelType :" + fuelType);
		 */
	}

	/*
	 * public String toString() { return
	 * "Car productionYear :"+productionYear+"\nCar numberOfGear :"
	 * +numberOfGear+"\nCar fuelType : "+fuelType; }
	 */

}
