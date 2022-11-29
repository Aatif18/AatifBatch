package com.cantrolstatementprogram;

import java.util.Scanner;

public class CalculatorWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1, no2;
		String yn, sym;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter the first number :");
			no1 = sc.nextInt();
			System.out.println("Enter the second number :");
			no2 = sc.nextInt();
			System.out.println("Enter the symboll(+,-,*,/)");
			sym = sc.next();
			switch (sym) {
			case "+":
				System.out.println("Addition of two number is :" + (no1 + no2));
				break;
			case "-":
				System.out.println("Subtraction of two number is :" + (no1 - no2));
				break;
			case "*":
				System.out.println("Multiplication of two number is :" + (no1 * no2));
				break;
			case "/":
				System.out.println("Divide of two number is :" + (no1 / no2));
				break;

			default:
				System.out.println("invalid");
			}
			System.out.println("Do you want to continue (press Y for yes N for no) ");
			yn = sc.next();
		} while (yn.equals("Y") || yn.equals("y"));
		sc.close();

	}

}
