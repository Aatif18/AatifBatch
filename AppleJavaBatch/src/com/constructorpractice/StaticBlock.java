package com.constructorpractice;

public class StaticBlock {
	int id;
	String name;
	String dept;
	{System.out.println("Block 1");
		id=101;
		name="Aatif";
		dept="Mechanical";
	}
	
	{System.out.println("Block 2");
	id=102;
	name="Atf";
	dept="Mechanical";
}

	StaticBlock(){
		System.out.println("Simple Constructor :");
		id=10;
		name="aa";
		dept="zz";
		
	}

	public static void main(String[] args) {
		StaticBlock s = new StaticBlock();
		
		
	}

}
