package com.assignment3;

import java.util.Scanner;

public class TotalAveragePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float total, average, percentage, english, hindi, maths, science, urdu;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the English marks :");
		english = sc.nextFloat();
		System.out.println("Enter the hindi marks :");
		hindi = sc.nextFloat();
		System.out.println("Enter the maths marks :");
		maths = sc.nextFloat();
		System.out.println("Enter the science marks :");
		science = sc.nextFloat();
		System.out.println("Enter the urdu marks :");
		urdu = sc.nextFloat();
		total = english + hindi + maths + science + urdu;
		percentage = (total * 100) / 500;
		System.out.println("Percentage " + percentage + "%");
		average = total / 5;
		System.out.println("average is :" + average);
		sc.close();
	}

}
