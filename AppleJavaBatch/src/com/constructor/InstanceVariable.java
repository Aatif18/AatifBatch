package com.constructor;

public class InstanceVariable {
	
	  int id;    // instance vairable or global variable 
	  String name;
	  static String dept;
	  static int z=10;
	 
	InstanceVariable(){
		
	}
	void main() {
		int a;   //local varaible
		int b;
	}
	static void add() {
		 dept="MEchanical";      //Static variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	    
	    System.out.println(InstanceVariable.z);
		InstanceVariable i = new InstanceVariable();
		System.out.println(i.z);
		//i.add();
		InstanceVariable.add();
		// refrence variable = object 
		System.out.println(i.id);
		System.out.println(i.name);
		
	}

}
