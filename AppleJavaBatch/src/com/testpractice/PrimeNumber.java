package com.testpractice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a prime number ");
		num=sc.nextInt();
		
		for(int i=2;i<=num;i++)
		{
			boolean b=false;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					b=true;
				}
			}
			if(b==false)
			{
				System.out.println(i);
			}
		}
	}

}
