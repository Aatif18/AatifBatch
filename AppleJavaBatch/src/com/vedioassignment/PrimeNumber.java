package com.vedioassignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a prime number :");
		num = sc.nextInt();

		for (j = 2; j < num;j++) {
			boolean b = false;

			for (int i = 2; i < j/2; i++) {
				if (j % i == 0) {
					b = true;
				}
			}
			if (b == false) {
				System.out.println(j);
			}
		}
		sc.close();
	}

}
