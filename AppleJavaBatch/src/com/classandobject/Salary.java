package com.classandobject;

import java.util.Scanner;

public class Salary {
	void pfCalculator(int salary) {
		salary=(salary*15)/100;
		System.out.println("Salary is :"+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary s = new Salary();
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary :");
		a=sc.nextInt();
		s.pfCalculator(a);
	}

}
