package com.whileloop;

import java.util.Scanner;

public class AdditionOfDigitProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,product=1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number :");
		num=sc.nextInt();
		while(num!=0)
		{
			int r=num%10;
			product=product*r;
			num=num/10;
		}
		System.out.println("Addition is :"+product);
		sc.close();
	}

}
