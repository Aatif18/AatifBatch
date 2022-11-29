package com.practicenumberpattern;

public class NumberPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	1
		2 2
		3 3 3
		4 4 4 4
		5 5 5 5 5   */
		
		for(int i=1;i<=5;i++)       //i=1     j=1
		{							//i=2     j=1,2
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
