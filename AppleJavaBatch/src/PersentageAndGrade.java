import java.util.Scanner;

public class PersentageAndGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1, no2, no3, no4, no5;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A MARKS");
		System.out.println("Marks of SOM");
		no1 = sc.nextInt();
		System.out.println("Marks of DOM");
		no2 = sc.nextInt();
		System.out.println("Marks of TOM");
		no3 = sc.nextInt();
		System.out.println("Marks of HMT");
		no4 = sc.nextInt();
		System.out.println("Marks of RAC");
		no5 = sc.nextInt();
		int total = no1 + no2 + no3 + no4 + no5;
		float persentage = (100 * total) / 500;
		System.out.println("Persentage" + persentage + "%");
		if (persentage >= 85) {
			System.out.println("A grade");
		} else if (persentage >= 75) {
			System.out.println("B grade");
		} else if (persentage >= 65) {
			System.out.println("C grade");
		} else if (persentage >= 55) {
			System.out.println("D grade");
		} else {
			System.out.println("Fail");

		}
		sc.close();

	}

}
