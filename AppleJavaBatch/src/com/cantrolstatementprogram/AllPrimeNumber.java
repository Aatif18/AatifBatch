package com.cantrolstatementprogram;

public class AllPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int no = 2; no < 100; no++) {
			boolean b = false;
			for (int i = 2; i < no / 2; i++) {
				if (no % i == 0) {
					b = true;
				}
			}
			if (b == false) {
				System.out.println(no);
			}
		}

	}

}
