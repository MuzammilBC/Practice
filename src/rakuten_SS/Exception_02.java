package rakuten_SS;

public class Exception_02 {

	public static void main(String[] args) {
    		
		
		try {
			System.out.println("1 coonecting to the application server");
			System.out.println("2.1 connecting to the SQL Driver");
			System.out.println("3. performing CRUD operation");
			System.out.println("4.Fetching the value and doing Arithmetic calculation");
			System.out.println(10/0);

			//It terminate the all execution 
			System.exit(0);
		}
		catch(Exception e) {
			System.exit(-1);
			System.out.println("Hello every one");
			e.printStackTrace();
		}
		// It execute the line of code even if exception occurs
		finally {
			System.out.println("5. close DB");
			System.out.println("6.Send Report");
		}
	}

}
