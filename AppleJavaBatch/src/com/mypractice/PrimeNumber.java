package com.mypractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prime Number - vo hota hai jo 1 se ya itself se he divide hota hai

		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num = sc.nextInt();
		boolean b = false;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) 
			{
				b = true;
			}

		}
		if (b == true) {
			System.out.println("Its not a prime number : :");

		} else {
			System.out.println("Its a prime number :");
		}
		sc.close();
	}

}
