package com.assignment3;

import java.util.Scanner;

public class VowelAndConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabat :");
		ch = sc.next().charAt(0);
		switch (ch) {
		case 'a':
			System.out.println("vowel ");
			break;
		case 'e':
			System.out.println("vowel");
			break;
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;
		default:
			System.out.println("consonent");

		}
		sc.close();
	}

}
