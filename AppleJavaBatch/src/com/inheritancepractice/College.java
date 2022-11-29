package com.inheritancepractice;

public class College {
	int code;
	String name,address;
	Depertment dept;
	Laboratory lab;
	
	College(int code,String name,String address,int id,String aname,int noOfInstument,String labIncharge)
	{
		this.code=code;
		this.name=name;
		this.address=address;
		this.dept=dept;
		this.lab=lab;
		dept=new Depertment(id,name);
		lab=new Laboratory(noOfInstument,labIncharge);
	}
	public String toString() {
		return "Code :"+code+"\nName :"+name+"\nAddress :"+address+"\nDepertment :"+dept+"\nLaboratory :"+lab;
	}
}
