package com.weekdayassignment;

import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num = sc.nextInt();
		while (num != 0) 
		{
			int rem=num%10;
			product=product*rem;
			num=num/10;
		}
		System.out.println("Product of digit :"+product);
		sc.close();
	}

}
