package com.constructorpractice;

public class Main2 {
	
	String language;
	Main2(){
		this.language="JAVA";
	}
	Main2(String lang){
		this.language=lang;
	}
	void getData() {
		System.out.println("Programming language :"+this.language);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 m1 = new Main2("PYTHON");
		Main2 m2 = new Main2();
		m1.getData();
		m2.getData();
	}

}
