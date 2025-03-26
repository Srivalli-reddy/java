package Package;

 class Teacher  {
	 
		 int id;
		 String name;
		 Address address;
		 public Teacher (int id, String name, Address address)
		 {
		 	this.id = id;
		 	this.name = name;
		 	this.address = address;
		 
		 }
		 public void display()
		 {
			 System.out.println("id : "+id);
			 System.out.println("name :"+name);
			 System.out.println("Addrress : "+address.street+","+address.area+","+address.dist);
		 }



	public static void main(String[] args)
	{
		Address adr1=new Address("v t street"," v t nagar","ap");
		Teacher Teacher1=new Teacher(221,"srinu",adr1);
		Teacher Teacher2=new Teacher(222,"vaasu",adr1);
		Teacher1.display();
		Teacher2.display();
	}
}