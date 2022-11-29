package com.numberpattern;

import java.util.Scanner;

public class NumberPattern0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Here is your pattern....!!!");

		for (int i = 1; i <= 5; i++) {        //i=1   num=1    j=1   num=1
			int num = i;					//num=1

			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");

				num = num + 5 - j;
			}

			System.out.println();
		}

	}

}
