import java.util.Scanner;

public class HotelMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantity;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Hotel Menu ");
		System.out.println(
				"1.Mutton Biryani-400 \n2.Chicken Biryani-300 \n3.Chicken Korma-150 \n4.Tandoor Roti-50 \n5.water bottle-20");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Your order is Mutton Biryani");
			System.out.println("Enter the quantity :");
			quantity = sc.nextInt();
			System.out.println(" Total amount is :" + 400 * quantity);
			break;
		case 2:
			System.out.println("Your order is Chicken Biryani");
			System.out.println("Enter the quantity :");
			quantity = sc.nextInt();
			System.out.println("Total amount is :" + 300 * quantity);
			break;
		case 3:
			System.out.println("Your order is Chicken Korma");
			System.out.println("Enter the quantity :");
			quantity = sc.nextInt();
			System.out.println("Total amount is :" + 150 * quantity);
			break;
		case 4:
			System.out.println("Your order is Tandoor Roti");
			System.out.println("Enter the quantity :");
			quantity = sc.nextInt();
			System.out.println("Total amount is :" + 50 * quantity);
			break;
		case 5:
			System.out.println("Your order is Water Bottle");
			System.out.println("Enter the quantity :");
			quantity = sc.nextInt();
			System.out.println("Total amount is :" + 20 * quantity);
			break;
			default : System.out.println("not available");

		}
		sc.close();

	}

}
