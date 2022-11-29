package com.classandobject;

import java.util.Scanner;

public class Shopping1 {
	
	String itemName;
	int price;
	int quantity;
	int total;
	
	void acceptDetails(String i,int p,int q) {
		
		
		  itemName=i; price=p; quantity=q;
		 
		
			/*
			 * Scanner sc = new Scanner(System.in);
			 * System.out.println("****Enter a Items****");
			 * System.out.println("Enter a items name :"); i=sc.next();
			 * System.out.println("Enter a price :"); p=sc.nextInt();
			 * System.out.println("Enter a quantity :"); q=sc.nextInt();
			 */
		 
		
	}
	void calculate() {
		
		total=price*quantity;
		
	}
	void display() {
		if(quantity>0) {
		System.out.println("Item Name : "+itemName);
		System.out.println("Item Price : "+price);
		System.out.println("Item Quantity : "+quantity);
		System.out.println("Total Bill : "+total);
		}else {
			System.out.println("Select any items");
		}
	}

	public static void main(String[] args) {
		
		Shopping1 s = new Shopping1();
		String a;
		int b,c;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("****Enter a Items****");
		  System.out.println("Enter a items name :");
		  a=sc.next();
		  System.out.println("Enter a price :");
		  b=sc.nextInt();
		  System.out.println("Enter a quantity :");
		  c=sc.nextInt();
		s.acceptDetails(a, b, c);;
		s.calculate();
		s.display();
	}

}
