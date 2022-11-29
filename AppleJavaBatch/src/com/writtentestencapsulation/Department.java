package com.writtentestencapsulation;
	
public class Department {
	private	int id;
	private	 String name;
		Student s;
		
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Student getS() {
			return s;
		}


		public void setS(Student s) {
			this.s = s;
		}


		public String toString() {
			return "Depertment id :"+id+"\nDepertment Name :"+name+"\n"+s;
		}
		
		
}
