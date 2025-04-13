package Project;
import java.util.Scanner;
	public class Main {
		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Restaurant restaurant = new Restaurant();
		        Customers customer = new Customers();

		        // Start the customer order process
		        customer.startOrder(restaurant, scanner);

		        scanner.close();
		    }
		}


	
		
		    


