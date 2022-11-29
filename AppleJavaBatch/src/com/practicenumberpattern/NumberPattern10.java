package com.practicenumberpattern;

public class NumberPattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		1 2 3 4 5
		  2 3 4 5
		    3 4 5
		      4 5
		        5
		      4 5
		    3 4 5
		  2 3 4 5
		1 2 3 4 5    */
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			  for(int k=i;k<=5;k++) 
			  { System.out.print(k+""); 
			  }
			 
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print(k+"");
			}
			System.out.println();
		}
	}

}
