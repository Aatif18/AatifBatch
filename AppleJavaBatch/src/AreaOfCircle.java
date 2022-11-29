import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * float r = 7.5f,area; area = 3.14f*r*r;
		 * System.out.println("Area of circle :"+area);
		 */
		/*
		 * int a = 5 ; int b =20 ; System.out.println(a++ + --b + --b + b/a + --a *
		 * b++); System.out.println("a= " + a + " b= " + b);
		 */

		float area, pi, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of pii :");
		pi = sc.nextFloat();
		System.out.println("Enter the value of radius :");
		r = sc.nextFloat();
		area = pi * r * r;
		System.out.println("Area of Circle is :" + area);
		sc.close();

	}

}
