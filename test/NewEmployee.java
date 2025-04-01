package test;

 class NewEmployee {
String name;
int salary;
int Date;
 NewEmployee(String name,int salary,int date)
 {

	this.name=name;
	this.salary=salary;
	this.Date=Date;
}
  void display()
  {
	  System.out.println(name+"salary: "+salary+" years: "+Date);
  }
 
 
 
	   public static void main(String[] args)
  {
	NewEmployee ob1= new NewEmployee("srinu",5000,19-7-2024);
	NewEmployee ob2= new NewEmployee("vasu",4000,23-6-2024);
	ob1.display();
	ob2.display();
  }
  }

 
