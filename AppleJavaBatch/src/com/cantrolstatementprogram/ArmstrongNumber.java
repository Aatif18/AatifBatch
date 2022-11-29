package com.cantrolstatementprogram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num=153;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		num=sc.nextInt();
		int temp1=num;
		int leng=0;
		while(temp1!=0) {
			leng=leng+1;
			temp1=temp1/10;
		}
		int temp2=num;
		int rem;
		int sum=0;
		while(temp2!=0) {
			rem=temp2%10;
			temp2=temp2/10;
			int multiply=1;
			for(int i=1;i<=leng;i++) {
				
				multiply=multiply*rem;
			}
			sum=sum+multiply;
		}
		if(num==sum) {
			System.out.println(num+" is an armstrong number ");
		}else {
			System.out.println(num+" is not an armstrong number ");
		}
		sc.close();
	}

}
