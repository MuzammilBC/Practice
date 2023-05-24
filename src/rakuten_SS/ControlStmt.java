package rakuten_SS;
public class ControlStmt {
	public static void main(String[] args) {
		int age = 27;
		if(age>0 && age <=5) {
			System.out.println("Free Tiket");
		}
		else if(age>5 && age <=12) {
			System.out.println("Half Tiket");
		}
		else if(age>12 && age <=59) {
			System.out.println("Full Tiket");
		}
		else if(age>59 && age <=100) {
			System.out.println("Senior Citizen Concessio");
		}
		else {
			System.out.println("Direct Ticket to Graveyard");
		}
		
	}
}
