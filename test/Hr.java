package test;

 class Worker
 {
	 void work()
	 {
		 System.out.println("Employee is working");
	 }
      int getsalary()
      {
	   return 5000;
       }
 }
class HR extends Worker
{
	void work()
	{
		System.out.println("HR manager");
	}
	void addEmployee()
	{
		System.out.println("new employee added");
	}

public static void main(String[] args)
	{
		HR hr=new HR();
		hr.work();
		System.out.println("salary: "+hr.getsalary());
		hr.addEmployee();
	}

}

 
