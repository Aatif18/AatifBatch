package com.forloop;

public class PrimeNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=400;i>=200;i--)
		{
			int k;
			for( k=2;k<=i/2;k++)
			{
				if(i%k==0)
				{
					break;
				}
			}
			if(k>i/2)
			{
				System.out.println(i);
			}
		}
		
	}

}
