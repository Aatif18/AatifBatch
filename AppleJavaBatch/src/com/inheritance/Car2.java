package com.inheritance;

public class Car2 {
	//Composition
	/*
	 * private int id,price; private String name,colour;
	 */
	int id,price;
	String name,colour;
	Driver d;
	 
	 Car2(int id,int price,String name,String colour,int aid,String aname,String acontact )
	 {
		 this.id=id;
		 this.price=price;
		 this.name=name;
		 this.colour=colour;
		 this.d=d;
		 
		d= new Driver(aid,aname,acontact);
	 }
	 public String toString() {
		 return "Id :"+id+"\nName :"+name+"\nColour :"+colour+"\nDriver :"+d;
	 }
}
