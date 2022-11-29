package com.assignment1;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Letter :");
		ch = sc.next().charAt(0);
		switch (ch) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			default : System.out.println("consonent");
		}
		sc.close();

	}

}
