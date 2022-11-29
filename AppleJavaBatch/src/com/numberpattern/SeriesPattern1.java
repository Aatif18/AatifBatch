package com.numberpattern;

public class SeriesPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int num1=0,num2=1,num3;
		for(int i=0;i<=5;i++)
		{
			num3=num2+i*i;
			num2=num3;
			System.out.print(num3+" ");
		}
	}

}
