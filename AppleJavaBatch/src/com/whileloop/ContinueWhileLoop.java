package com.whileloop;

public class ContinueWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int i=1; while(i<=10) { if(i==6) continue; System.out.println("i= "+i); i++;
		 * //niche wali value print nii karega vo 5 tk value he print karega; }
		 */
		int i=1;
		while(i<=10)
		{
			i++;
			if(i==6)
				continue;
			System.out.println("i= "+i);
		}
		System.out.println("out of the loop !!!");
		//isme vo 6 ko skip kr dega agar hum phle initilization karte hai to
	}

}
