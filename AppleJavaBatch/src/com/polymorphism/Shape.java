package com.polymorphism;

public class Shape {
	void area(int l,int b) {
		System.out.println("Area of rectangle is :"+(l*b));
	}
	
void area(int a) {
		System.out.println("Area of Squre is :"+(a*a));
	}

void area(float p,int h, int b) {
	System.out.println("Area of Triangle is :"+(p*h*b));
}

void area(float p,int r) {
	System.out.println("Area of Circle :"+(p*(r*r)));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		s.area(4);
		s.area(10, 5);
		s.area(3.14f,10, 5);
		s.area(3.14f, 4);
	}

}
