package com.cantrolstatementprogram;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem, rev = 0;
		int no = 58285;
		int temp = no;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		/*
		 * System.out.println("no is "+no); System.out.println("rev is "+rev);
		 */
		if (no == rev) {
			System.out.println(no + " is palindrome ");
		} else {
			System.out.println(no + " is not palindrome");
		}

	}

}
