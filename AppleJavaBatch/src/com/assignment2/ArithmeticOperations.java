package com.assignment2;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to enter two number and perform all arithmetic operations different
		// program for each

		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Addition \n2. Subtraction \n3. Multiplication \n4. Divide");
		System.out.println("Enter your choice :");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter two Addition Number :");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Sum of two Adition Number is :" + (a + b));
			break;
		case 2:
			System.out.println("Enter two Subtraction Number :");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Sum of two Subtraction Number is :" + (a - b));
			break;
		case 3:
			System.out.println("Enter two Multiplication Number :");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Sum of two Multiplication Number is :" + (a * b));
			break;
		case 4:
			System.out.println("Enter two Divide Number :");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Sum of two Divide Number is :" + (a / b));
			break;
			default : System.out.println("invalid number");
		}
		sc.close();

	}

}
