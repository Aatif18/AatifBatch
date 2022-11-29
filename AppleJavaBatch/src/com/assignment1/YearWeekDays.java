package com.assignment1;

import java.util.Scanner;

public class YearWeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month, year, week, day;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number of days:");
		
		month = s.nextInt();
		
		year = month / 365;
		
		month = month % 365;
		
		System.out.println("No. of years:" + year);
		
		week = month / 7;
		
		month = month % 7;
		
		System.out.println("No. of weeks:" + week);
		
		day = month;
		
		System.out.println("No. of days:" + day);
		
		s.close();
	}

}
