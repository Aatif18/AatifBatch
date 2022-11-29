package com.assignment3;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1, no2, no3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		no1 = sc.nextInt();
		System.out.println("Enter a second number :");
		no2=sc.nextInt();
		System.out.println("Enter a number three :");
		no3=sc.nextInt();
		if(no1>no2 && no1>no3)
		{
			System.out.println("First number is Maximum");
		}else if(no2>no1 && no2>no3)
		{
			System.out.println("Second nmumber is Maximum");
		}else {
			System.out.println("Third number is Maximum");
		}
		sc.close();
		

	}

}
