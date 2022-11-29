package com.inheritancepractice;

public class Depertment {
	int id;
	String aname;
	
	Depertment(int id,String aname)
	{
		this.id=id;
		this.aname=aname;
	}
	public String toString() {
		return "Id :"+id+"\nName :"+aname;
	}
}
