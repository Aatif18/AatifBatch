package com.inheritanceisarelationship;

public class PersonStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setAge(25);
		s.setCollege("Sardar Patel");
		s.setContact("7000978537");
		s.setId(101);
		s.setName("Aatif Aslam");
		s.setPercentage(80);
		//System.out.println(s);
		System.out.println("Age :"+s.getAge()+"\nCollege Name :"+s.getCollege()+"\nPerson Contact :"+s.getContact()+"\nPerson ID :"+s.getId()+"\nPerson Name :"+s.getName()+"\nPercentage :"+s.getPercentage());
		s.grade();
		System.out.println("------------------************-----------------------");
		Faculty f = new Faculty();
		f.setAge(25);
		f.setContact("7000978537");
		f.setId(101);
		f.setName("Aatif Aslam");
		f.setSalary(50000);
		f.setSubject("RAC");
		System.out.println("Person Age :"+f.getAge()+"\nPerson Contact :"+f.getContact()+"\nPerson ID :"+f.getId()+"\nPerson Name :"+f.getName()+"\nPerson Salary :"+f.getSalary()+"\nSubject :"+f.getSubject());
		f.pf();
	}

}
