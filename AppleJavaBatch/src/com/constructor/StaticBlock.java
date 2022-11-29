package com.constructor;

public class StaticBlock {
	int a;
	static int b;

	static {
		b++;
		System.out.println("Static block 1");
	}
	static {
		b++;
		System.out.println("Static block 2");
	}
	static {
		b++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(StaticBlock.b);
	}

}
