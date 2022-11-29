package com.assignment2;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p, t, r, si;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of Principal Amount :");
		p = sc.nextFloat();

		System.out.println("Enter the value of Time :");
		t = sc.nextFloat();

		System.out.println("Enter the value of Rate :");
		r = sc.nextFloat();

		si = (p * t * r) / 100;
		System.out.println("value of Simple Intrest is :" + si);
		sc.close();
	}

}
