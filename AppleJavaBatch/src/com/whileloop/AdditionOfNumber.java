package com.whileloop;

public class AdditionOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, limit = 5, sum = 0, product = 1, sumo = 0;
		while (i <= limit) {
			if (i % 2 != 0) 
			{
				sum =sum + i;
			} 
			else 
			{
				sumo += i;
		    }
		i++;
		}
		System.out.println("Addition of even number is :" + sum);
		System.out.println("Addition of odd number is :" + sumo);

		i = 1;
		while (i <= limit) {
			product *= i;
			i++;
		}
		System.out.println("product is :" + product);
	
	}
}
