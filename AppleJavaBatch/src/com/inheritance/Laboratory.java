package com.inheritance;

public class Laboratory {
	private String labincharge;
	private int noOfInstument;

	public int getNoOfInstument() {
		return noOfInstument;
	}

	public void setNoOfInstument(int noOfInstument) {
		this.noOfInstument = noOfInstument;
	}

	public String getLabincharge() {
		return labincharge;
	}

	public void setLabincharge(String labincharge) {
		this.labincharge = labincharge;
	}
	public String toString() {
		return "labincharge :"+labincharge+"\nNumber Of Instument :"+noOfInstument;
	}
}
