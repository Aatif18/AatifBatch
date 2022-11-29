package com.assignment1;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1-7 :");
		days = sc.nextInt();
		switch (days) {
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("TUESDDAY");
			break;
		case 3:
			System.out.println("WEDNESDAY");
			break;
		case 4:
			System.out.println("THUESDAY");
			break;
		case 5:
			System.out.println("FRIDAY");
			break;
		case 6:
			System.out.println("SATURDAY");
			break;
		case 7:
			System.out.println("SUNDAY");
			break;
			default : System.out.println(" day does not exist !!");
		}
		sc.close();
	}

}
