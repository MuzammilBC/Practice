package rakuten_SS;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose from the options below:");
		do {
			System.out.println("1. Yawn\n2. Snore\n"
					+ "3. Sleep Walking\n4. Nightmare\n"
					+ "5. Exit");
			System.out.println("Enter your choice [1-5]: ");
			int choice = scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Have Curd rice and yawn");
				break;
			case 2:
				System.out.println("Snore until the lion gets afraid");
				break;
			case 3:
				System.out.println("Walk until you become a zombie");
				break;
			case 4:
				System.out.println("Keep dreaming until you are dead");
				break;
			case 5:
				System.out.println("Thank for you wonderful cooperation");
				return;
			default:
				System.out.println("Invalid Choice");

			}
		}while(true);

	}
}
