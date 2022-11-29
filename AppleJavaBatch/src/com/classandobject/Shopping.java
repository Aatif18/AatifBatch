package com.classandobject;

public class Shopping {
	String itemName;
	int price;
	int quantity;
	int totalBill;

	void acceptDetails(String i, int p, int q) {
		itemName = i;
		price = p;
		quantity = q;

	}

	void calculate() {
		totalBill = (price * quantity);

	}

	void display() {
		if (quantity > 0) {
			System.out.println("Item Name :" + itemName + " \nPrice :" + price + "\nQuantity :" + quantity
					+ "\nTotal bill :" + totalBill);
		} else {
			System.out.println("Perches any items");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shopping s = new Shopping();

		s.acceptDetails("Bat", 12000, 4);
		s.calculate();
		s.display();
	}

}
