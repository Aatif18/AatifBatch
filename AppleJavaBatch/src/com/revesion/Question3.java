package com.revesion;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x=i;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			i++;
			System.out.println();
		}
		for(int i=7;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			i--;
			System.out.println();
		}
	}

}
