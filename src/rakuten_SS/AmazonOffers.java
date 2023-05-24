package rakuten_SS;
public class AmazonOffers {
	public static void main(String[] args) {
		char gender = 'f';
		int age = 57;
		boolean is_working = true;
		if(gender=='m') {
			if(age>20 && age<=50) {
				if(is_working) {
					System.out.println("You are eligible for 85% off on al amazon products");
				}
				else {
					System.out.println("Offer valid only for working people");
				}
			}
			else {
				System.out.println("Offer not valid for old people");
			}
		}
		else {
			System.out.println("Exclusive offers only for poor gender who sacrifices everything");
		}
	}
}
