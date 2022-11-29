package com.testpractice;

public class NumberPattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=4,l=1;
		for(int i=1;i<=6;i++)
		{
			System.out.print(l+" ");   //1+(4*1)
			l=l+(z*i);
		}
	}

}

/*
 * 1 
 * 1 2 
 * 1 2 3 
 * 1 2 3 4 5 6
 * 1 2 3 4 5 6 7
 */