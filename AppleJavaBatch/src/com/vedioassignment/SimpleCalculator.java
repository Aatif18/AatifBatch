package com.vedioassignment;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch, num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Divide");
		System.out.println("Enter your choice");
		ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Addition of two number :");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println("Addition is :" + (num1 + num2));
			break;
		case 2:
			System.out.println("Subtraction of two number :");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println("Subtraction is :" + (num1 - num2));
			break;
		case 3:
			System.out.println("Multiplication of two number :");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println("Multiplication is :" + (num1 * num2));
			break;
		case 4:
			System.out.println("Divide of two number :");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println("Divide is :" + (num1 / num2));
			break;
			default : System.out.println("INVALID !!!");
		}
		sc.close();
	}

}
