package rakuten_SS;
import java.util.Scanner;

public class Interview {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of records to store");
		int count = scan.nextInt();
		Interviewee[] intr = new Interviewee[count];
		for(int i=0; i<count; i++) {
			System.out.println("Enter the Name of the candidate: ");
			String name= scan.next();
			System.out.println("Enter the Age of the candidate: ");
			int age = scan.nextInt();
			System.out.println("Enter the Qualification of the candidate: ");
			String qual= scan.next();
			System.out.println("Enter the Percentage of the candidate: ");
			float percentage= scan.nextFloat();
			System.out.println("Enter the City of the candidate: ");
			String city= scan.next();
			System.out.println("Enter the State of the candidate: ");
			String state= scan.next();
			System.out.println("Enter the Country of the candidate: ");
			String country= scan.next();
			Address addr = new Address(city, state, country);
			Interviewee interv = new Interviewee(name, age, qual, addr, percentage);
			intr[i] = interv;
		}
		System.out.println("Initial Interviewee List: ");
		System.out.println("Name\tAge\tQualification\tCity\tState\tPercent");
		for(Interviewee inter: intr) {
			System.out.println(inter.name+"\t"+inter.age+"\t"+inter.qualification+"\t"
								+ inter.address.city+"\t"+inter.address.state+"\t"+inter.percentage);
		}
		System.out.println();
		System.out.println("Final Interviewee List after filter: ");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("\t\t\tCandidates List \t\t\t12-Apr-2023");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Name\tAge\tQualification\tCity\tState\tPercent");
		System.out.println("-------------------------------------------------------------------");
		for(Interviewee inter: intr) {
			if(inter.percentage>75) {
			System.out.println(inter.name+"\t"+inter.age+"\t"+inter.qualification+"\t"
								+ inter.address.city+"\t"+inter.address.state+"\t"+inter.percentage);
			}
		}
		System.out.println("-------------------------------------------------------------------");
	}
}
