package com.testpractice;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num=sc.nextInt();
		
		while(i<=10)
		{
			System.out.println(num*i);
			i++;
		}
		sc.close();
	}

}
