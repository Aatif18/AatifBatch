package com.constructor;

import java.util.Scanner;

public class Movie {
	String name;
	int releseyear;
	String producer;
	String budget;

	Movie(String name, int releseyear, String producer, String budget) {

		this.name = name;
		this.releseyear = releseyear;
		this.producer = producer;
		this.budget = budget;
	}

	void show() {
		System.out.println("Movie Name :" + name + "\nMovie Relese Year :" + releseyear + "\nMovie Produser Name :"
				+ producer + "\nMovie Budget is :" + budget);

	}

	public String toString() {
		return "Movie Name :" + name + "\nMovie Relese Year :" + releseyear + "\nMovie Produser Name :" + producer
				+ "\nMovie Budget is :" + budget;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("------------------****-------------------");
			System.out.println("movie name");
			String name = sc.next();
			System.out.println("Relese Year");
			int releseyear = sc.nextInt();
			System.out.println("Producer");
			String producer = sc.next();
			System.out.println("Movie Budget");
			String budget = sc.next();

			Movie m = new Movie(name, releseyear, producer, budget);
			System.out.println(m);
		}

	}

}
