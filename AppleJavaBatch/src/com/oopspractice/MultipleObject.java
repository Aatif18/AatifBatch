package com.oopspractice;

public class MultipleObject {
	
	int x=25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleObject obj1 = new MultipleObject();
		MultipleObject obj2 = new MultipleObject();
		
		obj2.x=50;
		System.out.println(obj2.x);
		System.out.println(obj1.x);
	}

}
