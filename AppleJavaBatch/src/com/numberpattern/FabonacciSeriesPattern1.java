package com.numberpattern;

public class FabonacciSeriesPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*0 
		 *1  1
		 *2  3  5
		 *8 13 21 34
		 */
		int num1=0,num2=1,num3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				num3=num1+num2;
				System.out.print(num1+" ");
				num1=num2;
				num2=num3;
			}
			System.out.println();
		}
		
		
	}

}
