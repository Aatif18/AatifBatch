package com.hw.assignment;

import java.util.Scanner;

public class RectanglePerameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float l,b,perameter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of length :");
		l=sc.nextFloat();
		System.out.println("Enter the value of breadth :");
		b=sc.nextFloat();
		perameter=2*(l+b);
		System.out.println("Perameter of rectangle :"+perameter);
		sc.close();
	}

}
