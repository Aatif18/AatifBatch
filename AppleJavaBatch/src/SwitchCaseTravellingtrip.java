import java.util.Scanner;

public class SwitchCaseTravellingtrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many participants for trip ?");
		int p = sc.nextInt();
		System.out.println("Number of participants :" + p);
		switch (p) {
		case 4:
			System.out.println("So lets,Arrenge CAR");
			break;
		case 7:
			System.out.println("So lets,Arrenge EARTIGA");
			break;
		case 8:
			System.out.println("So lets,Arrenge INOVA");
			break;
		case 15:
			System.out.println("So lets,Arrenge MINI BUS");
			break;
		case 40:
			System.out.println("So lets,Arrenge BUS");
			break;
			default : System.out.println("INVALID!!");
		}
		sc.close();
	}

}
