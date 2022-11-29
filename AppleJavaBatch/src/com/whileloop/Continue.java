package com.whileloop;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit=10,c=0;
		while(c<=limit)
		{
			c++;
			if(c%4==0)
				continue;
			{
				System.out.print(" "+c);
			}
		}
	}

}
