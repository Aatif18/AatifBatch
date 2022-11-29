package com.methodoverriding;

public class Ecosport extends Car {
	void dashboard() {
		super.dashboard();
		System.out.println("Screening System ");
	}
	void speed() {
		System.out.println("Ecosport Speed :180");
	}
}
