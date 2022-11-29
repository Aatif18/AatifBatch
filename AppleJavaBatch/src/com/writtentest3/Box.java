package com.writtentest3;

public class Box {
	
	int length;
	int width;
	int height;
	void volume(int l, int w, int h) {
		length=l;
		width=w;
		height=h;
		int volume=l*w*h;
		System.out.println("Volume of the box :"+volume);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box();
		b.volume(20, 15, 10);
	}

}
