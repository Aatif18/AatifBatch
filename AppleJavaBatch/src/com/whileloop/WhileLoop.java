package com.whileloop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		limit=sc.nextInt();
		while(i<=limit) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println("Done!!");
		sc.close();
	}

}
