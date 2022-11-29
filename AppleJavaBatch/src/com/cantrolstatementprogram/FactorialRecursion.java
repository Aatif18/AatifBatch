package com.cantrolstatementprogram;

public class FactorialRecursion {
	static int no = 6, fact = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialRecursion ob = new FactorialRecursion();
		ob.calcfact(no);
		System.out.println("Factorial is " + no + " is " + fact);
	}

	void calcfact(int no) {

		if (no >= 1) {
			fact = fact * no;
			no = no - 1;
			calcfact(no);
		}

	}

}
