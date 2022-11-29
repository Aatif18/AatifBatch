package com.forloop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		boolean b=false;
		System.out.println("Enter a number :");
		num=sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0) {
				
				b=true;
			}
		}
		if(b==true)
		{
			System.out.println("number is not prime !!!");
		}else
		{
			System.out.println("number is prime !!!");
		}
		sc.close();
		
	}

}
