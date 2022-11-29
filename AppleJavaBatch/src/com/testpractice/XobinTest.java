package com.testpractice;

import java.util.Scanner;

public class XobinTest {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		
		  Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter ");
		
		int  num=sc.nextInt();
		 
		
		for(int i=1;i<=num;i++)
		{
			int num1=a+b;
			System.out.print(a+" ");
			a=b;
			b=num1;
		}
	}

}
