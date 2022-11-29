package com.whileloop;

import java.util.Scanner;

public class AdditionOfDigitsNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num=sc.nextInt();
		while(num!=0)
		{
			int r = num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println("Addtion of Number :"+sum);
		sc.close();
	}

}
