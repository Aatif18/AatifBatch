package com.mypractice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,length=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number ");
		num=sc.nextInt();
		int temp=num;
		while(temp!=0)
		{
			length=length+1;
			temp=temp/10;
		}
		int rem,sum=0,temp1=num;
		while(temp1!=0)
		{
			rem=temp1%10;
			temp1=temp1/10;
			
			int multiply=1;
			for(int i=1;i<=length;i++)
			{
				multiply=multiply*rem;
			}
			sum=sum+multiply;
		}
		if(num==sum)
		{
			System.out.println(num+" is a armstrong number");
		}else {
			System.out.println(num+" is not armstrong number");
			sc.close();
		}
	}

}
