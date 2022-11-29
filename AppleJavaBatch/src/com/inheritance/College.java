package com.inheritance;

public class College {
	private int code;
	private String name;
	private String address;
	Depertment dept;
	Laboratory lab;
	
	public void setDept(Depertment dept)
	{
		this.dept=dept;
	}
	public Depertment getDept() {
		return dept;
	}
	
	public void setLab(Laboratory lab)
	{
		this.lab=lab;
	}
	public Laboratory getLab()
	{
		return lab;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "College code :"+code+"\nCollege Name :"+name+"\nCollege Address :"+address+"\nDepertment :"+dept+"\nLaboratory :"+lab;
	}
}
