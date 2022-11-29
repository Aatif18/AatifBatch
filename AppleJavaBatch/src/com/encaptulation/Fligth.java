package com.encaptulation;

public class Fligth {
 
	private	int id,fare;
	private	String company,source,destination,classes;
	int ticketRate;
		
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
	    return id;	
	}
	
	public void setCompany(String company) 
	{
		this.company=company;
	}
	public String getCompany()
	{
		return company;
	}
	
	public void setSource(String source)
	{
		this.source=source;
	}
	public String getSource()
	{
		return source;
	}
	
	public void setDestination(String destination)
	{
		this.destination=destination;
	}
	public String getDestination()
	{
		return destination;
	}
	
	public void setClasses(String classes)
	{
		this.classes=classes;
	}
	public String getClasses() {
		return classes;
	}
	
	public void setFare(int fare)
	{
		this.fare=fare;
	}
	public int getFare() {
		return fare;
	}
	
	
	void display() {
		
		System.out.println("Enter id :"+id);
		System.out.println("Enter compnay Name :"+company);
		System.out.println("Enter the source :"+source);
		System.out.println("Enter the destination :"+destination);
		System.out.println("Enter the class :"+classes);
		
	}

}
