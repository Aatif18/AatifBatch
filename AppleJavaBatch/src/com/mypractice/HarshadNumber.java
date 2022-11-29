package com.mypractice;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num=sc.nextInt();
		int temp=num;
		
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(temp%sum==0)
		{
			System.out.println(temp+" is a harshad number ");
		}else {
			System.out.println(temp+" not a harshad number");
		}
		sc.close();
	}

}
