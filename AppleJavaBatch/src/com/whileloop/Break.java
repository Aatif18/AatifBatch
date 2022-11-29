package com.whileloop;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a limit :");
		limit=sc.nextInt();
		while(c<=limit)
		{
			c++;
			if(c%5==0)
			{
				break;
			}
			System.out.println(" "+c);
		}
		System.out.println("out of loop"+c);
		sc.close();
	}

}
