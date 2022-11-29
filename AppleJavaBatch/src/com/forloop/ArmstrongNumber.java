package com.forloop;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153, count = 0, sum = 0;
		int temp = num;
		Scanner sc = new Scanner(System.in);
		while (temp != 0)      //first count
		{
			count++;
			temp = temp / 10;
		}
		temp = num;
		while (temp != 0) {
			int power = 1;         // get individual number
			int rem = temp % 10;
			for (int i = 1; i <= count; i++) {
				power = power * rem;      // multiply individual number
			}
			sum = sum + power;            // then sum
			temp = temp / 10;

		}
		if (sum == num) {
			System.out.println("Armstrong number ");
		} else {
			System.out.println("not Armstrong number ");
		}
		sc.close();
	}

}
