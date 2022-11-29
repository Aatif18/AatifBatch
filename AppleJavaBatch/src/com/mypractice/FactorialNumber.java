package com.mypractice;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// agae hum five ke factorial nikalte hai then 5*4*3*2*1
		
		int num,fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value :");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial number is :"+fact);
		sc.close();
	}

}
