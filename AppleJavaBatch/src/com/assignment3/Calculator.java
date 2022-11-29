package com.assignment3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.division");
		System.out.println("Enter your choice :");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter two number of addtion :");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Addition of two number :" + (a + b));
			break;
		case 2:
			System.out.println("Enter two number of Subtraction :");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Subtraction of two number :" + (a - b));
			break;
		case 3:
			System.out.println("Enter two number of Multiplication :");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Multiplication of two number :" + (a * b));
			break;
		case 4:
			System.out.println("Enter two number of division :");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("division of two number :" + (a / b));
			break;
			default : System.out.println("invalid");
		}
		sc.close();

	}

}
