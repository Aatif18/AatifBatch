package com.numberpattern;

public class SeriesPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 2 6 15 31 56
		int j=1;
		for(int i=1;i<=6;i++)
		{
			
			System.out.print(j+" ");
			j=j+(i*i);
		}
	}

}
