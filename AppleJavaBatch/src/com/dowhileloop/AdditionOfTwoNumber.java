package com.dowhileloop;

import java.util.Scanner;

public class AdditionOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		char ch;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter the value :");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Addition is :" + (a + b));
			System.out.println("Do you want to continue?? (y/n)");
			ch = sc.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
		sc.close();
	}

}
