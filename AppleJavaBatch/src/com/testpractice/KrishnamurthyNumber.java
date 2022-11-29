package com.testpractice;

import java.util.Scanner;

public class KrishnamurthyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem,fact,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		num=sc.nextInt();
		int temp=num;
		while(num>0)
		{
			fact=1;
			rem=num%10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		
		if(sum==temp)
		{
			System.out.println("KrishnamurthyNumber");
		}else {
			System.out.println("not a KrishnamurthyNumber");
		}
	}

}
