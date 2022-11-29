import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Addition \n2.Subtraction \n3.multiplication \n4.divide");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter two number of addition");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Addition is :" + (a + b));
			break;
		case 2:
			System.out.println("Enter two number of Subtraction");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Subtraction is :" + (a - b));
			break;
		case 3:
			System.out.println("Enter two number of Multiplication");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Multiplication is :" + (a * b));
			break;
		case 4:
			System.out.println("Enter two number of Divide");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Divide is :" + (a / b));
			break;
			default : System.out.println("invalid");
		}sc.close();
	}

}
