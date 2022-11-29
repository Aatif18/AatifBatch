package com.classandobject;

import java.util.Scanner;

public class BonusPfCalcutator {
	
	float bonus(int salary, char ch) {
		
		float newSal;
		System.out.println("Original Salary :"+salary);
		if(ch=='A')
			newSal=salary+(salary*0.15f);
		else if(ch=='B')
			newSal=salary+(salary*0.10f);
		else if(ch=='c')
			newSal=salary+(salary*0.05f);
		else
			newSal=salary;
		
		System.out.println("Salary after adding bonus :"+newSal);
		return newSal;

		
	}
	void pfcalculator(float salary)
	{
		float pf = salary*0.15f;
		System.out.println("pf :"+pf);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary , rating(A/B/C/D) of the employee");
		int sal=sc.nextInt();
		char c = sc.next().charAt(0);
		
		BonusPfCalcutator b = new BonusPfCalcutator();
		//b.bonus(sal, c);
		float newSal = b.bonus(sal, c);
		b.pfcalculator(newSal);
		//b.pfcalculator(sal);
	}

}
