package project;

import java.util.*;

public class Restaurant {
    private Map<Integer, String> menuItems = new LinkedHashMap<>();
    private Map<String, Double> itemPrices = new HashMap<>();
    private Map<String, Integer> order = new LinkedHashMap<>();
    private Map<String, Double> coupons = new HashMap<>();

    public Restaurant() {
        // Menu items
        menuItems.put(1, "Paneer Tikka");
        itemPrices.put("Paneer Tikka", 180.0);

        menuItems.put(2, "Butter Naan");
        itemPrices.put("Butter Naan", 40.0);

        menuItems.put(3, "Mango Lassi");
        itemPrices.put("Mango Lassi", 60.0);

        menuItems.put(4, "Chicken Biryani");
        itemPrices.put("Chicken Biryani", 220.0);

        menuItems.put(5, "Veg Combo (Paneer + Naan + Lassi)");
        itemPrices.put("Veg Combo (Paneer + Naan + Lassi)", 250.0);

        menuItems.put(6, "Non-Veg Combo (Biryani + Lassi)");
        itemPrices.put("Non-Veg Combo (Biryani + Lassi)", 260.0);

        // Coupons
        coupons.put("WELCOME10", 10.0);
        coupons.put("SAVE20", 20.0);
    }

    public void showMenu() {
        System.out.println("\n========== MENU ==========");
        for (Map.Entry<Integer, String> entry : menuItems.entrySet()) {
            System.out.printf("%d. %-35s Rs. %.2f\n", entry.getKey(), entry.getValue(), itemPrices.get(entry.getValue()));
        }
        System.out.println("0. Finish ordering");
        System.out.println("==========================");
    }

    public void takeOrder(Scanner sc) {
        showMenu();  // Show menu only once

        boolean ordering = true;
        while (ordering) {
            System.out.print("Select item number: ");
            int choice = sc.nextInt();
            if (choice == 0) break;

            String item = menuItems.get(choice);
            if (item == null) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            System.out.print("Enter quantity for " + item + ": ");
            int qty = sc.nextInt();
            order.put(item, order.getOrDefault(item, 0) + qty);
        }
    }

    public void generateBill(Customer customer, double discountPercent, String couponCode) {
        double subtotal = 0;

        System.out.println("\n========== FINAL BILL ==========");
        System.out.println("Customer: " + customer.getName());
        
        System.out.println("----------------------------------");
        System.out.printf("%-30s %5s %10s\n", "Item", "Qty", "Total");

        for (String item : order.keySet()) {
            int qty = order.get(item);
            double price = itemPrices.get(item);
            double total = qty * price;
            subtotal += total;
            System.out.printf("%-30s %5d %10.2f\n", item, qty, total);
        }

        double discount = subtotal * (discountPercent / 100.0);
        double coupon = subtotal * (coupons.getOrDefault(couponCode.toUpperCase(), 0.0) / 100.0);
        double finalTotal = subtotal - discount - coupon;

        System.out.println("----------------------------------");
        System.out.printf("Subtotal: %36.2f\n", subtotal);
        System.out.printf("Discount (%.0f%%): %26.2f\n", discountPercent, discount);
        if (coupon > 0) {
            System.out.printf("Coupon (%s): %27.2f\n", couponCode.toUpperCase(), coupon);
        }
        System.out.println("----------------------------------");
        System.out.printf("Total Amount: %28.2f\n", finalTotal);
        System.out.println("==================================");
        System.out.println("        Thank you! Visit again!");
        System.out.println("==================================");
    }
}
