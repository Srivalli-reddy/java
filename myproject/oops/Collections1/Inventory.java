package Collections1;
import java.util.ArrayList;
import java.util.List;
public class Inventory {
	List<Product>products;
	public Inventory()
	{
		this.products=new ArrayList<>();
	}
	public void addProduct(Product product)
	{
		this.products.add(product);
	}
	public void removeProducts(String name)
	{
		boolean productFound=false;
		for(Product product:products)
		{
			if(product.name.equals(name))
			{
				System.out.println("product");
				products.remove(product);
				productFound=true;
				break;
			}
		}
		if(!productFound)
		{
			System.out.println("there is no product found with name : "+name);
		}
	}
	public void displayProducts()
	{
	for(Product product:products)
	{
		System.out.println(product);
	}
	}
	public void checkLowInventory()
	{
		if(products.size()<3)
		{
			System.out.println("low inventory detected : "+products.size());
		}
		else
		{
			System.out.println("inventory is with capacity of : "+products.size());
		}
	}

}
