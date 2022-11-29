package com.classobjectwrittentest;

import java.util.Scanner;

public class StudentClass {
	int a, b, c;

	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of MATHS :");
		a = sc.nextInt();
		System.out.println("Enter the marks of ENGLISH :");
		b = sc.nextInt();
		System.out.println("Enter the marks of SCIENCE :");
		c = sc.nextInt();

	}

	int calculatePercentage() {
		int percentage = (a+b+c)/3;
		System.out.println("Percentage "+percentage+" %");
		return percentage;
	}
	void result(int persentage) {
		if(persentage>=70)
		{
			System.out.println("First class ");
		}else if(persentage>=50)
		{
			System.out.println("Second class ");
		}else {
			System.out.println("Fail ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass s = new StudentClass();
		s.setData();
		int persentage=s.calculatePercentage();
		s.result(persentage);
	
	}

}
