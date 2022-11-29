package com.mypractice;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Agar number reverse karne ke baad bhi same hai then it is called palindrome number
		
		int num,rem,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
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
			System.out.println("Palindrome number :");
		}else
		{
			System.out.println("Not palindrome number :");
		}
		sc.close();
	}

}
