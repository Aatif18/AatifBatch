package com.practicenumberpattern;

public class NumberPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 5 4 3 2 1
		 * 5 4 3 2
		 * 5 4 3 
		 * 5 4 
		 * 5
		 */
		//int x = 1;
		for (int i = 1; i <= 5; i++) // i=5 j= 5
		{
			for (int j = 5; j >= i; j--) // j=5
			{
				System.out.print(j + " ");
			}
			System.out.println();
			//x++;
		}
	}

}
