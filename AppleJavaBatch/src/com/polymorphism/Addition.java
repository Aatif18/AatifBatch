package com.polymorphism;

public class Addition {
	void add(int a,int b)
	{
		System.out.println("Addition of two number is :"+(a+b));
	}
	
	void add(int a,int b, int c)
	{
		System.out.println("Addition of two number is :"+(a+b+c));
	}
	
	void add(String a,int b)
	{
		System.out.println("Addition of two number is :"+(a+b));
	}
	
	void add(int a,String b)
	{
		System.out.println("Addition of two number is :"+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a = new Addition();
		a.add(10, 20);
		a.add(10, 20, 30);
		a.add(50,"Display");
		a.add("AAtif", 18);
	}

}
