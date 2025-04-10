package project;
import java.util.Scanner;
public class Main {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.println("Welcome to Spicy Grill!");
	        System.out.print("Enter your name: ");
	        String name = sc.nextLine();

	       

	        Customer customer = new Customer(name, name);
	        Restaurant restaurant = new Restaurant();

	        
	        restaurant.takeOrder(sc);

	        
	        System.out.print("Enter discount % (0 if none): ");
	        double discount = sc.nextDouble();
	        sc.nextLine(); 

	        System.out.print("Enter coupon code (or press Enter to skip): ");
	        String coupon = sc.nextLine();

	       
	        restaurant.generateBill(customer, discount, coupon);

	        
	    }
	}



