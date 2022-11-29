package com.inheritancepractice;

public class Laboratory {
	int noOfInstument;
	String labIncharge;
	
	Laboratory(int noOfInstument,String labIncharge  )
	{
		this.noOfInstument=noOfInstument;
		this.labIncharge=labIncharge;
	}
	public String toString() {
		return "Number Of Instument :"+noOfInstument+"\nLab Incharge :"+labIncharge;
	}
}
