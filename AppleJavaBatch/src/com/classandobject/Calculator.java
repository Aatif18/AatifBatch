package com.classandobject;

import java.util.Scanner;

public class Calculator {
			void add() {
				int a,b;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a two number :");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Addition is :"+(a+b));
			}
			void substract() {
				int a,b;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a two number :");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Substraction is :"+(a-b));
			}
			void multiply() {
				int a,b;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a two number :");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Multiply is :"+(a*b));
			}
			void divide() {
				int a,b;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a two number : ");
				a=sc.nextInt();
				b=sc.nextInt();
				System.out.println("Divide is :"+(a/b));
			}
}
