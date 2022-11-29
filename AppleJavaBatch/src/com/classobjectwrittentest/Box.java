package com.classobjectwrittentest;

import java.util.Scanner;

public class Box {

	int length;
	int width;
	int height;
	int volume;

	void setData(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}

	void display() {
		
		volume=length*width*height;
		System.out.println("Volume of the Box is :"+volume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b = new Box();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of length :");
		int x = sc.nextInt();
		System.out.println("Enter the value of width :");
		int y = sc.nextInt();
		System.out.println("Enter the value of heigth :");
		int z = sc.nextInt();
		b.setData(x, y, z);
		b.display();
		sc.close();

	}

}
