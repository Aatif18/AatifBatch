package com.assignment2;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to enter base and height of a triangle and find it area ?
		
		float b,h,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of base :");
		b=sc.nextFloat();
		System.out.println("Enter the value of heigth :");
		h=sc.nextFloat();
		area=0.5f*b*h;
		System.out.println("Area of triangle is :"+area);
		sc.close();
	}

}
