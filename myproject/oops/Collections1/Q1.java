package Collections1;

public class Q1 {

	public static void main(String[] args) {
		Inventory inv=new Inventory();
		inv.addProduct(new Product("Iphone"));
		inv.addProduct(new Product("vivo"));
		inv.addProduct(new Product("oppo"));
		inv.checkLowInventory();
		inv.displayProducts();
	    inv.removeProducts("vivo");
		inv.checkLowInventory();
		
	}

}
