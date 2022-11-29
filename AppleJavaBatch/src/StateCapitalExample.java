import java.util.Scanner;

public class StateCapitalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sname;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a State Name");
		sname = sc.nextLine();
		sname = sname.toUpperCase();
		switch (sname) {
		case "MAHARASTRA":
			System.out.println("capital is MUMBAI");
			break;
		case "MADHYA PRADESH":
			System.out.println("capital is BHOPAL");
			break;
		case "TELANGANA":
			System.out.println("capital is HYDRABAD");
			break;
		case "KARNATAKA":
			System.out.println("capital is BANGLORE");
			break;
		case "JHARKHAND":
			System.out.println("capital is RACHI");
			break;
		case "CHATTISGARD":
			System.out.println("capital is RAIPUR");
			break;
		default:
			System.out.println("invalid input");
		}
		sc.close();
	}

}
