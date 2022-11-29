package com.numberpattern;

public class FabonacciSeriesPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i+x;j++)
			{
				
				System.out.print(j+" ");
			}
			x=x+1;
			System.out.println();
		}
	}

}
