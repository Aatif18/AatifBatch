package com.assignment3;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num = sc.nextInt();
		System.out.println("Enter a year :");
		year = sc.nextInt();
		switch (num) {
		case 1:
		case 3:
		case 5:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days :");
			break;
		case 2:
			if (year % 4 == 0) {
				System.out.println("29 days :");
			} else
				System.out.println("28 days2 :");
			break;
		case 4:
		case 6:
		case 7:
		case 11:
			System.out.println("30 days :");
			break;
		default:
			System.out.println("invalid :");
		}
		sc.close();
	}

}
