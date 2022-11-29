package com.constructor;

public class ConstructorChaining {
	ConstructorChaining() {
		this(10);
		System.out.println("Simple constructor :");

	}

	ConstructorChaining(int x) {
		this(10, 20);
		System.out.println("one perameter constructor :"+(x));
	}

	ConstructorChaining(int x, int y) {
		this(10, 20, 30);
		System.out.println("two perameter constructor :"+(x+y));
	}

	ConstructorChaining(int x, int y, int z) {
		System.out.println("Three perameter constructor :"+(x+y+z));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorChaining();

	}

}
