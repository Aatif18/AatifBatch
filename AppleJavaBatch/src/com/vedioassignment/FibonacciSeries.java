package com.vedioassignment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, num1 = 0, num2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			int num3 = num1 + num2;
			System.out.println(num3 + " ");
			num1 = num2;
			num2 = num3;
		}

		sc.close();
	}

}
