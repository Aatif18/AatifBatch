package com.whileloop;

import java.util.Scanner;

public class PrimeNumberMid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i=2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num=sc.nextInt();
		int mid=num/2;
		while(i<=mid)
		{
			if(num%i==0) {
				break;
			}
			i++;
		}
		if(i>mid)
		{
			System.out.println("prime number ");
		}
		else {
			System.out.println("not prime number");
		}
		sc.close();
		
	}

}
