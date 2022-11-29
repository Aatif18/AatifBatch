package com.forloop;

public class PowerBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=2,power=3;
		long res=1;
		for(;power!=0;--power)
		{
			res=res*base;
		}
		System.out.println(" "+res);
	}

}
