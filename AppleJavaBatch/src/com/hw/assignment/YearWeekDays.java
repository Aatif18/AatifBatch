package com.hw.assignment;

import java.util.Scanner;

public class YearWeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year, week, days, month;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days :");
		month = sc.nextInt();
		year = month / 365;
		month = month % 365;
		System.out.println("number of year :" + year);
		week = month / 7;
		month = month % 7;
		System.out.println("number of week :" + week);
		days = month;
		System.out.println("number of days :" + days);
		sc.close();
	}

}
