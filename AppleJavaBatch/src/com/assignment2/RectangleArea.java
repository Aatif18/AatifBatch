package com.assignment2;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to enter length and breadth of a rectangle and find its area ?
		
		float l,b,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of length :");
		l=sc.nextFloat();
		System.out.println("Enter the value of breadth :");
		b=sc.nextFloat();
		area=l*b;
		System.out.println("Area of rectangle is :"+area);
		sc.close();
	}

}
