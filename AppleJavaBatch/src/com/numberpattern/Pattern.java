package com.numberpattern;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int c=a+b;
				System.out.print(a+" ");
				a=b;
				b=c;
			}
			System.out.println();
		}
		
		
		
	}

}
