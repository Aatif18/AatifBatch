package com.alphabatpattern;

public class AlphabatPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A
		  B C
		  D E F
		  G H I J*/
		
		int count = 65;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)count+" ");
				count = count + 1;
			}
			System.out.println();
		}
	}

}
