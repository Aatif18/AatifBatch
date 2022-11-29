package com.inheritance;

public class Engine {
	private int productionYear,numberOfGear;
	private String fuelType;
	public int getProductionYear() {
		return productionYear;
	}
	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}
	public int getNumberOfGear() {
		return numberOfGear;
	}
	public void setNumberOfGear(int numberOfGear) {
		this.numberOfGear = numberOfGear;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	void display() {
		System.out.println("Engine productionYear :"+productionYear);
		System.out.println("Engine numberOfGear :"+numberOfGear);
		System.out.println("Engine fuelType :"+fuelType);
	}
}
