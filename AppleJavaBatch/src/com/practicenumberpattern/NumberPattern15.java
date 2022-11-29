package com.practicenumberpattern;

public class NumberPattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	1
		2 6
		3 7 10
		4 8 11 13
		5 9 12 14 15  */
		
		for(int i=1;i<=5;i++)
		{
			int x=i;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(x+" ");
				x=x+5-j;
			}
			
			
			System.out.println();
		}
				
	}

}
