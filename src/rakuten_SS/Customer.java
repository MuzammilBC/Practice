package rakuten_SS;
import java.util.Scanner;

public class Customer {
public static void main(String[] args) {
	Bank b = new Bank(87453.56);
	Scanner scan = new Scanner(System.in);
	Card c = new Card();
	System.out.println("Choose the mode of login: ");
	do {
		System.out.println("1. Net banking");
		System.out.println("2. Mobile banking");
		System.out.println("3. Atm");
		System.out.println("4. Exit");
		System.out.println("Choose [1-4]: ");
		int choice = scan.nextInt();
		switch(choice) {
		
		case 1:
				b.login("muthu", "admin");
				break;
		case 2:
				b.login(5678);
				break;
		case 3:
				b.login(c,1221);
				break;
		case 4:
				return;
		default:
				System.out.println("Invalid Choice");
		}
	}while(true);
}
}
