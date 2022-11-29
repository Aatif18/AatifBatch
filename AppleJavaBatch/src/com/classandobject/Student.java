package com.classandobject;

public class Student {
	int id;
	String name;
	float english, maths, science;

	void details(int i, String n) {
		id = i;
		name = n;

	}

	void persentage(float e, float m, float s) {
		english = e;
		maths = m;
		science = s;
		float total = ((e + m + s) * 100) / 300;
		System.out.println("Persentage is : " + total+" %");
	}

	void display() {
		System.out.println("Student id :" + id);
		System.out.println("Student name :" + name);
		System.out.println("Student engilsh marks :" + english);
		System.out.println("Student maths marks :" + maths);
		System.out.println("Student science marks :" + science);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.details(10, "Atif");
		s.persentage(75, 80, 85);
		s.display();
	}

}
