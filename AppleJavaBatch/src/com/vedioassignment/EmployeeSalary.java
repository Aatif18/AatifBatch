package com.vedioassignment;

import java.util.Scanner;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double basic, hra, da, gross;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a basic salary :");
		basic = sc.nextDouble();

		if (basic < 10000) {
			hra = basic * 20;
			da = basic * 80;
		} else if (basic < 20000) {
			hra = basic * 25;
			da = basic * 90;
		} else {
			hra = basic * 30;
			da = basic * 95;
		}
		gross = hra + da + basic;
		System.out.println("Gross Salary is :" + gross);
		sc.close();
	}

}
