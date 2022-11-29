package com.constructorpractice;

public class Main1 {

	String language;

	Main1(String lang) {
		language = lang;
		System.out.println("Programming Language :"+language);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main1 m1 = new Main1("JAVA");
		Main1 m2 = new Main1("PYTHON");
		Main1 m3 = new Main1("C++");
	}

}
