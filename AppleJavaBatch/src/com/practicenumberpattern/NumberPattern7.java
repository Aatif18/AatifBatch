package com.practicenumberpattern;

public class NumberPattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	1
		1 2 1
		1 2 3 2 1
		1 2 3 4 3 2 1
		1 2 3 4 5 4 3 2 1   */
		
		//int x=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int k=i-1;k>=1;k--)  //i=1-1=0,2-1=1,3-1=2
			{
				System.out.print(k+" ");
			}
			System.out.println();
			
		}
	}

}
