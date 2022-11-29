import java.util.Scanner;

public class GreatestAndSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2,no3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number :");
		no1=sc.nextInt();
		System.out.println("Enter a second number");
		no2=sc.nextInt();
		System.out.println("Enter a third number");
		no3=sc.nextInt();
		if(no1>no2 && no1>no3) {
			System.out.println("Largest number is :"+no1);
		}else if(no2>no1 && no2>no3) {
			System.out.println("Largest number is :"+no2);
		}else {
			System.out.println("Largest number is :"+no3);
		}if(no1<no2 && no1<no3) {
			System.out.println("Smallest number is :"+no1);
		}else if(no2<no1 && no2<no3) {
			System.out.println("Smallest number is :"+no2);
		}else {
			System.out.println("Smallest number is :"+no3);
		}sc.close();

 
			
		
	}

}
