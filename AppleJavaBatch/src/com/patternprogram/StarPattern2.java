package com.patternprogram;

import java.util.Scanner;

public class StarPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		row=sc.nextInt();
		
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
