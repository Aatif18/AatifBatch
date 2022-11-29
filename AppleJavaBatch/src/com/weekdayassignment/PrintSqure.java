package com.weekdayassignment;

import java.util.Scanner;

public class PrintSqure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int squre = 0, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			squre = i * i;
			System.out.println(squre);
		}
		sc.close();

	}

}
