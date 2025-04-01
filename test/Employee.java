package test;

 class Employee {
	 String name;
	 String job;
	 int salary;
	 public Employee(String name,String job,int salary)
	 {
		 this.name=name;
		 this.job=job;
		 this.salary=salary;
	 }
	 public void increaseSalary(double perc)
	 {
		 salary+=salary*perc/100;
	 }
public void display()
{
	System.out.println(name+" - "+job+" - "+salary);
}
public static void main(String[] args)
{
Employee emp=new Employee("srinu","developer",50000);
emp.display();
emp.increaseSalary(10);
emp.display();
}
}
