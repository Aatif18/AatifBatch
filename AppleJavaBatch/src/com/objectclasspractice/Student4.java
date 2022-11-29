package com.objectclasspractice;

public class Student4 {
	/*
	 * Add display method inside Student class change values of id, name in that
	 * method & also print the changed values in same method. Call display method
	 * from main method
	 */
	int id=1;
	String name="sss";
	void display() {
		
		System.out.println("id :"+id+"\nName :"+name);
		
		  id=2; 
		  name="aaa";
		  System.out.println("id :"+id+"\nname :"+name);
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student4 s = new Student4();
		//s.id=101;
		//s.name="Aatif";
		s.display();
	}

}
