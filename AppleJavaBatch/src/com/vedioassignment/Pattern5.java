package com.vedioassignment;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=64;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(count+j)+" ");
			}
			System.out.println();
		}
	}

}
