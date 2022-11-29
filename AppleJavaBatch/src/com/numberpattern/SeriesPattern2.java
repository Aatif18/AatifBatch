package com.numberpattern;

public class SeriesPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=1,num3;
		for(int i=1;i<=6;i++)				//1      5    13    25    41 61
		{									//1^2 2^2    3^3   4^4   5^5
			//num3=num2+i*(i+3);
			num3=(i*i)+(i-1)*(i-1);
			num1=num2;
			System.out.print(num3+" ");
		}
		
	}

}
