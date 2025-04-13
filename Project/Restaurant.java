package Project;
import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private Map<Integer, String> menuItems;
    private Map<Integer, Double> itemPrices;
    
    // Constructor to initialize the menu
    public Restaurant() {
        menuItems = new HashMap<>();
        itemPrices = new HashMap<>();
        
        // Menu Items and Prices
        menuItems.put(1, "Paneer Tikka");
        menuItems.put(2, "Butter Naan");
        menuItems.put(3, "Mango Lassi");
        menuItems.put(4, "Chicken Biryani");
        menuItems.put(5, "Veg Combo (Paneer + Naan + Lassi)");
        menuItems.put(6, "Non-Veg Combo (Biryani + Lassi)");
        
        itemPrices.put(1, 180.00);
        itemPrices.put(2, 40.00);
        itemPrices.put(3, 60.00);
        itemPrices.put(4, 220.00);
        itemPrices.put(5, 250.00);  // Veg Combo
        itemPrices.put(6, 260.00);  // Non-Veg Combo
    }
    
    // Method to print the menu (only once)
    public void printMenu() {
        System.out.println("========== MENU ==========");
        for (int itemNumber : menuItems.keySet()) {
            System.out.println(itemNumber + ". " + menuItems.get(itemNumber) + " - Rs. " + itemPrices.get(itemNumber));
        }
        System.out.println("==========================");
    }

    // Method to calculate the final bill
    public double calculateBill(Map<Integer, Integer> order) {
        double subtotal = 0.0;

        // Calculate subtotal by adding items in the order
        for (int itemNumber : order.keySet()) {
            int quantity = order.get(itemNumber);
            subtotal += itemPrices.get(itemNumber) * quantity;
        }

        // Apply GST (18%)
        double gst = subtotal * 0.18;
        double totalWithGst = subtotal + gst;

        // Apply discount (10%) if total exceeds 100
        double discount = 0.0;
        if (subtotal > 100) {
            discount = totalWithGst * 0.10;
        }
        
        double finalAmount = totalWithGst - discount;
        
        return finalAmount;
    }

    // Method to assign membership based on the total bill
    public String assignMembership(double finalAmount) {
        if (finalAmount > 2000) {
            return "Gold";
        } else if (finalAmount >= 1000) {
            return "Silver";
        } else {
            return "None";
        }
    }
    public String getMenuItem(int itemNumber) {
        return menuItems.getOrDefault(itemNumber, "Unknown Item");
    }

	public double getItemPrice(int itemNumber) {
		
		return itemPrices.getOrDefault(itemNumber, 0.0);
	}
}

