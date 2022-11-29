package com.inheritanceisarelationship;

public class SportsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricket c = new Cricket();
		c.setBall("we can use multiple");
		c.setEmpire(4);
		System.out.println("Cricket");
		System.out.println(c.getBall()+"\n"+c.getEmpire()+"\n"+Cricket.players);
		c.test();
		System.out.println("------------*****------------");
		
		Hockey h = new Hockey();
		h.setBall("Multilpe");
		h.setEmpire(3);
		System.out.println("Hockey");
		System.out.println(h.getBall()+"\n"+h.getEmpire()+"\n"+Hockey.players);
		h.league();
	}

}
