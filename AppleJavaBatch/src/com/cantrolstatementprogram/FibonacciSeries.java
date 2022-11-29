package com.cantrolstatementprogram;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=0,no2=1;
		for(int i=1;i<=10;i++)
		{
			int c=no1+no2;
			System.out.print(" "+c);
			no1=no2;
			no2=c;
		}
	}

}
