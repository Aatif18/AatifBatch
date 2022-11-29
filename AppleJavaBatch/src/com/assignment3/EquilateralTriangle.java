package com.assignment3;

import java.util.Scanner;

public class EquilateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Area of Equilateral Triangle :");
		System.out.println("Enter the value of a :");
		a=sc.nextFloat();
		area=(1.732f/4)*a;
		System.out.println("Area of Equilateral Triangle :"+area);
		sc.close();
	}

}
