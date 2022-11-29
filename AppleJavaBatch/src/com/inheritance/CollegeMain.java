package com.inheritance;

public class CollegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Depertment d1 = new Depertment();
		d1.setId(101);
		d1.setName("Mechanical");
		
		Laboratory l1 = new Laboratory();
		l1.setNoOfInstument(150);
		l1.setLabincharge("Saif sir");
		
		College c1 = new College();
		c1.setCode(0221);
		c1.setName("Sardar patel college");
		c1.setAddress("Bhopal");
		c1.setDept(d1);
		c1.setLab(l1);
		
		System.out.println(c1);
		
		
	}

}
