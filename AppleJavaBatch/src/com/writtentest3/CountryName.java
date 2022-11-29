package com.writtentest3;

import java.util.Scanner;

public class CountryName {

	

	void game() {
		String countryName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a country name ");
		countryName=sc.next();
		countryName=countryName.toLowerCase();
		

		switch (countryName) {
		case "india":
			System.out.println("National Game is Hockey");
			break;
		case "china":
			System.out.println("National Game is Table Tannis");
			break;
		case "bangladesh":
			System.out.println("National Game is Kabbadi");
			break;
		case "italy":
			System.out.println("National Game is Football");
			break;
		case "united state":
			System.out.println("National Game is Baseball");
			break;
		/*
		 * default: System.out.println("Invalid");
		 */
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountryName c = new CountryName();
		c.game();

	}

}
