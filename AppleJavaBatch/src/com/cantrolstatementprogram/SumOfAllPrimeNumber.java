package com.cantrolstatementprogram;

public class SumOfAllPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int num=2;num<=10;num++)
		{
			boolean b=false;
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					b=true;
				}
			}
			if(b==false) {
				sum=sum+num;
			}
		}
		System.out.println(sum);
		
	}

}
