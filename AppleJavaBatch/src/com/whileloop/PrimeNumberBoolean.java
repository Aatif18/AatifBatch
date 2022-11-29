package com.whileloop;

import java.util.Scanner;

public class PrimeNumberBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num = sc.nextInt();
		boolean b = true;

		while (i < num) {
			if (num % i == 0) {
				b = false;
				break;
			}
			i++;
		}
		if (b == false) {
			System.out.println("not prime number ");
		} else {
			System.out.println("prime number");
		}
		sc.close();
	}

}
