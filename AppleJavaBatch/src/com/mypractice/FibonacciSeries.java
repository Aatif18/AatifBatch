package com.mypractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Fibonacci Series - jiske andar hum ko two number provide kiye jate hai 0,1 next number jo hota hai 
		// vo dono ka sum hota hai 
		
		int num,num1=0,num2=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			int z=num1+num2;
			System.out.print(z+" ");
			num1=num2;
			num2=z;
		}
		sc.close();
	}

}
