package com.assignment2;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to calculate cube of given number ?
		
		int a,area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		a=sc.nextInt();
		area=a*a*a;
		System.out.println("Area of cube :"+area);
		sc.close();
	}

}
