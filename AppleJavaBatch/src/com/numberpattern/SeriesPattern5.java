package com.numberpattern;

public class SeriesPattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1;
		for(int i=1;i<=6;i++)
		{
			System.out.print(j+" ");
			j=j+(i*i*i);
		}
	}

}
