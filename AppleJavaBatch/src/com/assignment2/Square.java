package com.assignment2;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to calculate Square of given number ?
		
		int s,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		s=sc.nextInt();
		area=s*s;
		System.out.println("Area of Square :"+area);
		sc.close();
	}

}
