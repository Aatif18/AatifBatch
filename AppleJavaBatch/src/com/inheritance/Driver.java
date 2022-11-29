package com.inheritance;

public class Driver {
	/*
	 * private int aid; private String aname, acontact;
	 */
	String aname, acontact;
	int aid;

	Driver(int aid, String aname, String acontact) {
		this.aid = aid;
		this.aname = aname;
		this.acontact = acontact;
	}
	
	/*
	 * public int getAid() { return aid; }
	 * 
	 * 
	 * public void setAid(int aid) { this.aid = aid; }
	 * 
	 * 
	 * public String getAname() { return aname; }
	 * 
	 * 
	 * public void setAname(String aname) { this.aname = aname; }
	 * 
	 * 
	 * public String getAcontact() { return acontact; }
	 * 
	 * 
	 * public void setAcontact(String acontact) { this.acontact = acontact; }
	 */


	public String toString() {
		return "Id :" + aid + "\nName :" + aname + "\nContact :" + acontact;
	}

}
