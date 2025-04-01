package test;

 class Person {
	 String name;int age;
	 Person(String name,int age)
	 {
		 this.name=name;
		 this.age=age;
	 }
	 void display()
	 {
		 System.out.println(name+" is "+age+" years old");
	 }
	 public static void main(String[] args)
	 {
		 Person p1=new Person("hanu",23);
		 Person p2=new Person("vedanth",25);
		 p1.display();
		 p2.display();
	 }

}
