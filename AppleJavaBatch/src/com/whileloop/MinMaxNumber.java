package com.whileloop;

import java.util.Scanner;

public class MinMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		num=sc.nextInt();
		int min=num%10;
		int max=num%10;
		while(num!=0)
		{
			int r= num%10;
			if(r<min)
			{
				min=r;
			}
			if(r>max)
			{
				max=r;
			}
			num=num/10;
		}
		System.out.println("minimum digit is :"+min);
		System.out.println("maximum digit is :"+max);
		sc.close();
	}

}
