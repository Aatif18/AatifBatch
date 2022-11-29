package com.classandobject;

import java.util.Scanner;

public class Car {
	int speed;
	int price;
	String name;
	String colour;
	String mop;
	
	void setData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name,price,colour,speed,mop");
		name=sc.next();
		price=sc.nextInt();
		colour=sc.next();
		speed=sc.nextInt();
		mop=sc.next();
		
	}
	
	void discount() {
		
		float discount;
		System.out.println("Mode of Payment :"+mop);
		if(mop.equalsIgnoreCase("online")) {
			discount=price*0.05f;
			System.out.println("Discount is :"+discount);
			System.out.println("New price :"+(price-discount));
		}else {
			
			mop.equalsIgnoreCase("cash");
			discount=price*0.03f;
			System.out.println("Discount is :"+discount);
			System.out.println("New price :"+(price-discount));
		}
		
	}
	void display() {
		System.out.println("name "+"Price "+"colour");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.setData();
		c.discount();
		c.display();
		
	}

}
