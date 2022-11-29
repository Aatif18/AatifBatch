package com.forloop;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 400-200

		for (int num = 400; num >= 200; num--) {

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
