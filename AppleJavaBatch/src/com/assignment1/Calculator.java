package com.assignment1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Addition \n2.Subtraction \n3. Multiplication \n4. Divide ");
		System.out.println("Enter your choice :");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter two number of Addition  :");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Addition is :" + (a + b));
			break;
		case 2:
			System.out.println("Enter two number of Subtraction  :");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Subtraction is :" + (a - b));
			break;
		case 3:
			System.out.println("Enter two number of Multiplication  :");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Multiplication is :" + (a * b));
			break;
		case 4:
			System.out.println("Enter two number of Divide  :");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Divide is :" + (a / b));
			break;
		default:
			System.out.println("invalid");
		}
		sc.close();
	}

}
