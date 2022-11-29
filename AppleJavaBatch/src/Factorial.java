import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int num=6; int fact=1; for(int i=1;i<=num;i++) { fact=fact*i; }
		 * System.out.println("factorial of "+num+" is "+fact);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		int mid=num/2;
		int i =2;
		while(i<=mid)
		{
			if(num%i==0)
			{
				break;
			}
			i++;
		}
		if(i>=mid)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
