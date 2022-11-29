package com.testpractice;

public class NumberPattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int num3=num1+num2;
				System.out.print(num1+" ");
				num1=num2;
				num2=num3;
			}
			System.out.println();
		}
	}

}
