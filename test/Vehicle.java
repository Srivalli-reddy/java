package test;

 class Vehicle1 {
	 void drive()
	 {
		 System.out.println("i am in the vehicle");
	 }

}
 class Car extends Vehicle1
 {
	 void drive()
	 {
		 System.out.println("repair the car");
	 }
 }
 class Vehicle 
 {
	 public static void main(String[] args)
	 {
		 Car obj=new Car();
		 obj.drive();
	 }
 }
