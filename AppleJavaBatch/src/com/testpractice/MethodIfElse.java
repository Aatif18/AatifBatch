package com.testpractice;

import java.util.Scanner;

public class MethodIfElse {

	static void cheakAge(int age)
	{
		if(age<18) {
			System.out.println("Access Denied");
		}else {
			System.out.println("Access granted");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the value :");
		  int a=sc.nextInt();
		 cheakAge(a);
		
	}

	

}
