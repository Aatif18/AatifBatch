package com.alphabatpattern;

public class AlphabatPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*B
		 *B C
		 *B C D
		 *B C D E
		 */
		
		
		
		
		
		int count=65;
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
