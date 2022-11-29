package com.weekdayassignment;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base,power;
		long res=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a base :");
		base=sc.nextInt();
		System.out.println("Enter a power :");
		power=sc.nextInt();
		for(;power!=0;power--)
		{
			res=res*base;
		}
		System.out.println("result is :"+res);
		sc.close();
	}

}
             