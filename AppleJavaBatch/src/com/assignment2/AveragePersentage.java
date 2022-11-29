package com.assignment2;

import java.util.Scanner;

public class AveragePersentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total,SOM,TOM,DOM,HMT,RAC;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marrks :");
		System.out.println("Enter the number of SOM :");
		SOM=sc.nextInt();
		System.out.println("Enter the number of TOM :");
		TOM=sc.nextInt();
		System.out.println("Enter the number of DOM :");
		DOM=sc.nextInt();
		System.out.println("Enter the number of HMT :");
		HMT=sc.nextInt();
		System.out.println("Enter the number of RAC :");
		RAC=sc.nextInt();
		total=SOM+TOM+DOM+HMT+RAC;
		float percentage = (100*total)/500;
		System.out.println("Percentage "+percentage+"%");
		float average = total/5;
		System.out.println("Average of the total number :"+average);
		sc.close();
		
		
	}

}
