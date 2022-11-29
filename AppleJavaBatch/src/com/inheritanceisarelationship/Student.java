package com.inheritanceisarelationship;

public class Student extends Person {
	int percentage;
	String college;

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	void grade() {
		if (percentage >= 80) {
			System.out.println("Grade 'A'");
		} else if (percentage >= 70) {
			System.out.println("Grade 'B'");
		} else if (percentage >= 60) {
			System.out.println("Grade 'C'");
		} else if (percentage >= 50) {
			System.out.println("Grade 'D'");
		} else {
			System.out.println("Fail!!!");
		}

	}

	public String toString() {
		return "Student percentage=" + percentage + ", college=" + college + "";
	}

}
