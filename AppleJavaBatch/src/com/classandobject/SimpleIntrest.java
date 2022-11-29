package com.classandobject;

import java.util.Scanner;

public class SimpleIntrest {
	
	void display(int p,int t,int r) {
		
		int si=(p*t*r)/100;
		System.out.println("Simple intrest is :"+si);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleIntrest s = new SimpleIntrest();
		int p,t,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		p=sc.nextInt();
		t=sc.nextInt();
		r=sc.nextInt();
		
		s.display(p, t, r);
		
		
	}

}
