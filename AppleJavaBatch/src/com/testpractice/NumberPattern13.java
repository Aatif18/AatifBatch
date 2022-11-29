package com.testpractice;

public class NumberPattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		for(int i=1;i<=4;i++)
		{								//i=2 j<=i+x    i=4,x=3  j<=7
			for(int j=1;j<=i+x;j++)
			{
				System.out.print(j+" ");
			}
			x=x+1;
			System.out.println();
		}
	}

}
