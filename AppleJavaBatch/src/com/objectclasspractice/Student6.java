package com.objectclasspractice;

import java.util.Scanner;

public class Student6 {
	/*
	 * Write java Program for arithmetic operation for each operation write separate
	 * Method using parameter passing and return type.
	 */
	int a;
	int b;

	void add(int a1, int b1) {

		a = a1;
		b = b1;
		System.out.println("Addistion is :" + (a + b));
		;
	}

	void subtract(int a2, int b2) {
		a = a2;
		b = b2;
		System.out.println("Susbtraction is :" + (a - b));
	}

	void divide(int a3, int b3) {
		a = a3;
		b = b3;
		System.out.println("Divide is :" + (a / b));
	}

	void multiply(int a4, int b4) {
		a = a4;
		b = b4;
		System.out.println("Multiply is :" + (a * b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student6 s1 = new Student6();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first value :");
		int a1 = sc.nextInt();
		System.out.println("Enter a second value :");
		int b1 = sc.nextInt();
		s1.add(a1, b1);
		System.out.println("------------------****------------------");
		System.out.println("Enter a first value :");
		int a2 = sc.nextInt();
		System.out.println("Enter a second value :");
		int b2 = sc.nextInt();
		Student6 s2 = new Student6();
		s2.subtract(a2, b2);
		System.out.println("------------------****-------------------");
		System.out.println("Enter a first value :");
		int a3 = sc.nextInt();
		System.out.println("Enter a second number :");
		int b3 = sc.nextInt();
		Student6 s3 = new Student6();
		s3.divide(a3, b3);
		System.out.println("------------------****-------------------");
		System.out.println("Enter a first value :");
		int a4 = sc.nextInt();
		System.out.println("Enter a second value :");
		int b4 = sc.nextInt();
		Student6 s4 = new Student6();
		s4.multiply(a4, b4);

	}

}
