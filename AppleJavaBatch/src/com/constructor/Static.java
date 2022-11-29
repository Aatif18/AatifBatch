package com.constructor;

public class Static {
	int id;
	String name;
	static String location;
	
	void method() {
		System.out.println("id is :"+id);
	}
	static void show() {
		location="Nagpur";
		Static s = new Static();
		s.id=10;
		s.name="Manorama";
		System.out.println("Location is :"+location);
		System.out.println(s.id);
		System.out.println(s.name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static s1 = new Static();
		Static s2 = new Static();
		//s2.method();
	//	s1.method();
		Static.show();
	}

}
