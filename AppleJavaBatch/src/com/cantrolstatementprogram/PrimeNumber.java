package com.cantrolstatementprogram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		no=sc.nextInt();
		boolean b=false;
		for(int i=2; i<no; i++)
		{
			if(no%i==0)
			{
				b=true;
			}
		}
		if(b==true)
		{
			System.out.println("Number is not prime");
		}else
		{
			System.out.println("number is prime");
		}
		sc.close();
	}

}
