import java.util.Scanner;

public class BrandNameSwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brand;
		Scanner sc = new Scanner(System.in);
		System.out.println("Brands Of Shoe");
		brand = sc.nextInt();
		switch (brand) {
		case 1:
			System.out.println("NIKE = 5000rs");
			break;
		case 2:
			System.out.println("PUMA = 4000rs");
			break;
		case 3:
			System.out.println("ADIDAS = 6000rs");
			break;
		case 4:
			System.out.println("REEBOK = 5500rs");
			break;
		case 5:
			System.out.println("CAMPUS = 4500rs");
			break;
		case 6:
			System.out.println("RED CHIEF = 7000rs");
			break;
			
			default : System.out.println("not available");
		}
		sc.close();
	}

}
