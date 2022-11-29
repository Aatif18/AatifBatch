package com.alphabatpattern;

public class AlphabatPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*A 
          A B 
          A B C 
          A B C D */
		
		
		
		
		int count = 64;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(count+j)+" ");
			}
			System.out.println();
		}
	}

}
