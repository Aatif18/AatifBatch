package com.inheritance;

public class Car1 {

	int price;
	String name, colour;
	Engine1 e;

	Car1(int price, String name, String colour, Engine1 e) {
		this.price = price;
		this.name = name;
		this.colour = colour;
		this.e = e;
	}

	void display() {
		System.out.println("Car price :" + price+"\nCar Colour :" + colour+"\nCar Name :" + name+"\nCar Engine :");
		e.display();
		/*
		 * System.out.println("Car Colour :" + colour); System.out.println("Car Name :"
		 * + name); System.out.println("Car Engine :" + e);
		 */
	}

	/*
	 * public String toString() { return "Car price :" + price + "\nCar colour :" +
	 * colour + "\nCar name :" + name + "\nCar Engine :" + e; }
	 */
}
