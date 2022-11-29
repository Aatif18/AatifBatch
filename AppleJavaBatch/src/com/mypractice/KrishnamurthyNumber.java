package com.mypractice;

import java.util.Scanner;

public class KrishnamurthyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,fact,sum=0,rem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a nunber");
		num=sc.nextInt();
		int temp=num;
		
		while(temp>0)
		{
			fact=1;
			rem=temp%10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			temp=temp/10;
		}
		if(sum==num) {
			System.out.println("Krishnamurthy Number");
		}else {
			System.out.println("Not a Krishnamurthy Number");
		}
		sc.close();
	}

}
