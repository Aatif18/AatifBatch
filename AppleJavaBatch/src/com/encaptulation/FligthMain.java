package com.encaptulation;

public class FligthMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fligth f = new Fligth();
		
		f.setId(101);
		f.setSource("Nagpur");
		f.setCompany("indigo");
		f.setDestination("Hydrabad");
		f.setClasses("Economiee");
	    f.setFare(5000);
		
		f.display();
		System.out.println(f.getId()+" "+f.getSource()+" "+f.getCompany()+" "+f.getDestination()+" "+f.getClasses()+" "+f.getFare());

	}

}
