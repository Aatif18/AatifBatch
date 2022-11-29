package com.whileloop;

public class WhileLoopPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,sum=0;
		
		while(i <= 10)
		{
			System.out.println("i = "+i);
			i++;
		}
		int k = 10;
		while(k >= 1)
		{
			System.out.println("k = "+k);
			k--;
		}
		while(i <= 10)
		{
			sum+=i;
			i++;
		}
		System.out.println("Sum of first 10 natural number :"+sum);
	}

}
