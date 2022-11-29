import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int num; Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter a number"); num = sc.nextInt(); if(num%2==0) {
		 * System.out.println("even number"); }else { System.out.println("odd number");
		 * } sc.close();
		 */
		/*
		 * float num; Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter a number"); num = sc.nextFloat(); if(num%2==0) {
		 * System.out.println("Even number"); }else { System.out.println("odd number");
		 * } sc.close();
		 */
		/*
		 * double num; Scanner sc = new Scanner(System.in);
		 * System.out.println("enter a number"); num= sc.nextDouble(); if(num%2==0) {
		 * System.out.println("Even Number"); }else { System.out.println("Odd Number");
		 * } sc.close();
		 */
		/*
		 * double area, l, w; Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter a Lenght"); l = sc.nextDouble();
		 * System.out.println("Enter a Width"); w = sc.nextDouble(); area = l * w;
		 * System.out.println("Area of Rectangle :" + area); sc.close();
		 */
		/*
		 * int amount; double balance; Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter a amount"); amount=sc.nextInt();
		 * System.out.println("Enter a balance"); balance=sc.nextDouble();
		 * balance=balance-(amount+0.50);
		 * System.out.println("left balance is :"+balance); sc.close();
		 */
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter marks of maths "); int num1 = sc.nextInt();
		 * System.out.println("Enter marks of chemistry "); int num2 = sc.nextInt();
		 * System.out.println("Enter amarks of physics"); int num3 = sc.nextInt(); int
		 * total = num1+num2+num3; float persentage=(100* total)/300;
		 * System.out.println("persentage "+persentage+"%");
		 */
	
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b=sc.nextInt();
		System.out.println("Enter the third number");
		c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("largest number is :"+a);
		}else if(b>a && b>c) {
			System.out.println("largest number is :"+b);
		}else if(c>a && c>b) {
			System.out.println("largest number is :"+c);
		}
		sc.close();


	}

}
