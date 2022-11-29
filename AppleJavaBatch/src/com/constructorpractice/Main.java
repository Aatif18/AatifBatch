package com.constructorpractice;
class Car{
	
	String brand;
	public Car(){
		this.brand ="Ford";
	}
	public String getBrand() {
		return brand;
	}

	void run() {
		System.out.println("Car is running...");
	}


}

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Car ford = new Car();
		String brand = ford.getBrand();
		System.out.println(brand);
		ford.run();
	}

}

