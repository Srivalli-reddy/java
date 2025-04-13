package Project;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Customers {
	
	
	 private String name;
	    
	    // Method to start the ordering process
	    public void startOrder(Restaurant restaurant, Scanner scanner) {
	        System.out.print("Enter your name: ");
	        name = scanner.nextLine();

	        // Show the menu
	        restaurant.printMenu();

	        Map<Integer, Integer> order = new HashMap<>();
	        int choice;
	        do {
	            System.out.print("Select item number (0 to finish): ");
	            choice = scanner.nextInt();

	            if (choice >= 1 && choice <= 6) {
	                scanner.nextLine();  // consume newline character
	                System.out.print("Enter quantity for " + restaurant.getMenuItem(choice) + ": ");
	                int quantity = scanner.nextInt();
	                order.put(choice, order.getOrDefault(choice, 0) + quantity);
	            } else if (choice != 0) {
	                System.out.println("Invalid selection. Try again.");
	            }
	        } while (choice != 0);

	        // Calculate and print the bill
	        double finalAmount = restaurant.calculateBill(order);
	        String membership = restaurant.assignMembership(finalAmount);
	        printBill(order, restaurant, finalAmount, membership);
	    }

	    // Method to print the bill
	    public void printBill(Map<Integer, Integer> order, Restaurant restaurant, double finalAmount, String membership) {
	        System.out.println("\n===== BILL RECEIPT =====");
	        System.out.println("Customer Name: " + name);
	        System.out.println("Itemized Bill:");
	        
	        double subtotal = 0.0;
	        for (int itemNumber : order.keySet()) {
	            int quantity = order.get(itemNumber);
	            double price = restaurant.getItemPrice(itemNumber);
	            double itemTotal = price * quantity;
	            subtotal += itemTotal;
	            System.out.printf("%-20s %3d   Rs. %.2f  Rs. %.2f\n", restaurant.getMenuItem(itemNumber), quantity, price, itemTotal);
	        }

	        // Print final details
	        System.out.printf("\nSubtotal: Rs. %.2f", subtotal);
	        double gst = subtotal * 0.18;
	        System.out.printf("\nGST (18%%): Rs. %.2f", gst);
	        double discount = 0.0;
	        if (subtotal > 100) {
	            discount = (subtotal + gst) * 0.10;
	        }
	        System.out.printf("\nDiscount: Rs. %.2f", discount);
	        double finalAmountWithGST = subtotal + gst - discount;
	        System.out.printf("\nFinal Amount: Rs. %.2f", finalAmountWithGST);
	        System.out.println("\nMembership: " + membership);
	        System.out.println("\nThank you for dining at Spicy Grill!");
	    }
	}