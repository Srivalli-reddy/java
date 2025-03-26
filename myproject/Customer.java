package Package;

 class Customer {
 String name;
 Saloon saloon;//entity reference
 int id;
 public Customer(String name,Saloon saloon,int id)
 {
	 this.name=name;
	 this.saloon=saloon;
	 this.id=id;
 }
 public void displaycustomer()
 {
	 System.out.println("customer name : "+ name);
	 System.out.println("customer id : "+id);
	 saloon.displaySaloon();//accessing saloon details
 }
 public static void main(String[] args)
 {
	 Saloon saloon=new Saloon("Green Trends","vizianagaram");
	 Customer customer1=new Customer("Atharva",saloon,45);
	 Customer customer2=new Customer("Murali",saloon,46);
	 Customer customer3=new Customer("Antony",saloon,47);
	 customer1.displaycustomer();
	 customer2.displaycustomer();
	 customer3.displaycustomer();
 }
}
