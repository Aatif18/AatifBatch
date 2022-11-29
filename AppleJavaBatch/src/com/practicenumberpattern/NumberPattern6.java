package com.practicenumberpattern;

public class NumberPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	5
		5 4
		5 4 3
		5 4 3 2
		5 4 3 2 1  */
		
		for(int i=5;i>=1;i--)   //i=5  j=5
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
