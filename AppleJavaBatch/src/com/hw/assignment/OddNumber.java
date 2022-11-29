package com.hw.assignment;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your limits :");
		number = sc.nextInt();
		i = 229;
		while (i <=number) {
			System.out.println("Odd number value :" + i);
			i = i + 2;
		}
		sc.close();
	}

}
