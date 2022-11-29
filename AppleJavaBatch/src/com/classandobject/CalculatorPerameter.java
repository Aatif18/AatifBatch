package com.classandobject;

import java.util.Scanner;

public class CalculatorPerameter {

	void add(int a, int b) {
		System.out.println("Addition is :" + (a + b));
	}

	void substract(int a, int b) {
		System.out.println("Multiply is :" + (a - b));
	}

	void divide(int a, int b) {
		System.out.println("Multiply is :" + (a * b));
	}

	void multiply(int a, int b) {
		System.out.println("Multiply is :" + (a / b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorPerameter c = new CalculatorPerameter();
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number ");
		x = sc.nextInt();
		System.out.println("Enter a second number");
		y = sc.nextInt();
		c.add(x, y);
		c.substract(x, y);
		c.multiply(x, y);
		c.divide(x, y);

		sc.close();

	}

}
