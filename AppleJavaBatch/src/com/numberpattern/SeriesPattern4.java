package com.numberpattern;

public class SeriesPattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 5 13 25 41 61
		int j=4,l=1;
		for(int i=1;i<=6;i++)
		{
			System.out.print(l+" ");
			l=l+j*i;
		}
	}

}
