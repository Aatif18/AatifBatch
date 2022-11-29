package com.assignment3;

import java.util.Scanner;

public class DivisibleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener a number is divisible by 5 and 11 or not :");
		number = sc.nextInt();
		if(number % 5 == 0)
		{
			System.out.println("given number "+number+" is divisible for 5 and 11");
		}else
		{
			System.out.println("given number "+number+" is not divisible for 5 and 11");
		}
		sc.close();
	}

}
