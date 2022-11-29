package com.whileloop;

import java.util.Scanner;

public class AdditionOfDigitCtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, cnt = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num = sc.nextInt();
		while (num != 0) {
			int r = num % 10;
			cnt++;
			num = num / 10;
		}
		System.out.println("Addition is :" + cnt);
		sc.close();
	}

}
