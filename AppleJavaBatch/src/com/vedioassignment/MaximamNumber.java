package com.vedioassignment;

import java.util.Scanner;

public class MaximamNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a first number :");
		num1=sc.nextInt();
		System.out.println("Enter a second number :");
		num2=sc.nextInt();
		System.out.println("Enter a third number :");
		num3=sc.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("first number is larger :");
		}else if (num2>num1 && num2>num3)
		{
			System.out.println("second number is larger :");
		}else {
			System.out.println("third number is larger :");
		}
		sc.close();
	}

}
