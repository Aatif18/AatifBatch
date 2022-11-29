package com.dowhileloop;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		char ch1;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Addition \n2.Substraction \n3.Multiplication \n4.Divide");
			System.out.println("Enter your choice :");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter two number for Addition :");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("Addition is :" + (a + b));
				break;
			case 2:
				System.out.println("Enter two number for Substraction :");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("Substraction is :" + (a - b));
				break;
			case 3:
				System.out.println("Enter two number for Multiplication :");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("Multiplication is :" + (a * b));
				break;
			case 4:
				System.out.println("Enter two number for Divide :");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("Divide is :" + (a / b));
				break;
			default:
				System.out.println("invalid");
			}
			System.out.println("Do you want to continue :(y/n)");
			ch1 = sc.next().charAt(0);
		} while (ch1 == 'Y' || ch1 == 'y');
		sc.close();
	}

}
