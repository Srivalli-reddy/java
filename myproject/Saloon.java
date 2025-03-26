package Package;

 class Saloon {
	 String name;
	 String Address;
	
	 public Saloon(String name,String Address)
	 {
		 this.name=name;
		 this.Address=Address;
		 
	 }
	 public void displaySaloon()
	 {
		System.out.println("Saloon name : "+ name);
		System.out.println("Saloon Address : "+Address);
	 }

}
