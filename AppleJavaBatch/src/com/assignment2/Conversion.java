package com.assignment2;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to enter length in centimeter and convert it into meter and kilometer?

		/*
		 * Scanner in = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the length in centimeter:: ");
		 * 
		 * float c = in.nextFloat(); float m; float km; m = (float) (c / 100); km =
		 * (float) (c / 100000);
		 * 
		 * System.out.println("Length in Meter      = " + m + " meter");
		 * System.out.println("Length in Kilometer  = " + km + " kilometer");
		 * in.close();
		 */
		float c,m,km;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length in centimeter :");
		c=sc.nextFloat();
		m=(c/100);
		km=(c/100000);
		System.out.println("Length in meter "+m+"meter");
		System.out.println("Length in kilometer "+km+"kilometer");
		sc.close();
		
	}

}
