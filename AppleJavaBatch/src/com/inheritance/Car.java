package com.inheritance;

public class Car {

	private int price;
	private String name, colour;
	Engine e;

	public void setE(Engine e) {
		this.e = e;
	}

	public Engine getE() {
		return e;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	void display() {
		
		System.out.println("Car price :"+price);
		System.out.println("Car Colour :"+colour);
		System.out.println("Car Name :"+name);
	}

}
