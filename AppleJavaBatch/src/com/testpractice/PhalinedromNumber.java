package com.testpractice;

import java.util.Scanner;

public class PhalinedromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		num=sc.nextInt();
		int temp=num;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev)
		{
			System.out.println("Palinedrom number ");
		}else {
			System.out.println("not a Palinedrom number ");
		}
		sc.close();
	}

}
