package com.assignment2;

import java.util.Scanner;

public class TwoNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to enter two number and find their sum
		
		int no1, no2, result;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any two number :");

		no1 = sc.nextInt();

		no2 = sc.nextInt();

		result = no1 + no2;

		System.out.println("Result of two number sum :" + result);

		sc.close();

	}

}
