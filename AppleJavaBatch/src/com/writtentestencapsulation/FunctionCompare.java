package com.writtentestencapsulation;

import java.util.Scanner;

public class FunctionCompare {
	void compare(int a, int b) {
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

	void compare(char a, char b) {
		 int x = (int) a;
		 int y = (int) b;
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FunctionCompare fc = new FunctionCompare();

		//System.out.println("Enter a values :");
		System.out.println("Enter a Integer First Number :");
		int num1 = sc.nextInt();
		System.out.println("Enter a Integer Second Number :");
		int num2 = sc.nextInt();
		fc.compare(num1, num2);
		System.out.println("------------------*********--------------------");

		System.out.println("Enter a first Charecter value :");
		char num3 = sc.next().charAt(0);
		System.out.println("Enter  a Second Charecter value :");
		char num4 = sc.next().charAt(0);
		sc.nextLine();
		fc.compare(num3, num4);

	}

}
