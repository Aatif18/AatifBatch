package com.weekdayassignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num = 400; num >= 300; num--) {

			int i = 2;
			int m = num / 2;

			while (i <= m) {
				if (num % i == 0) {
					break;
				}
				i++;
			}
			if (i > m) {
				System.out.println(num);     
			}

		}
	}

}
