package com.whileloop;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10, sum = 0;
		while (i > 0) {
			sum += i;
			i--;
		}
		System.out.println("Sum of 10 numbers is :" + sum);

		/*
		 * int sum=0; for(int j=10;j>=1;j--) { sum=sum+j; System.out.print(sum+" "); }
		 */
	}

}
