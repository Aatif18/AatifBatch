package com.assignment1;

import java.util.Scanner;

public class MaximamNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2,no3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number first :");
		no1=sc.nextInt();
		System.out.println("Enter the number second");
		no2=sc.nextInt();
		System.out.println("Enter the number third");
		no3=sc.nextInt();
		if(no1>no2 && no1>no3) {
			System.out.println("first number is greater :");
		}else if(no2>no1 &&no2>no3) {
			System.out.println("Sceond number is greater :");
		}else if(no3>no1 && no3>no2){
			System.out.println("third number is greater :");
		}else {
			System.out.println("invalid");
		}
		sc.close();
		
	}

}
