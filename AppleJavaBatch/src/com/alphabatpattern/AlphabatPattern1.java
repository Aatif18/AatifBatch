package com.alphabatpattern;

public class AlphabatPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 65
		 * 66 67
		 * 68 69 70
		 * 71 72 73 74
		 */
		
		
		
		
		
		int count = 65;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count=count+1;
			}
			System.out.println();
		}
	}

}
