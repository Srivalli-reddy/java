package myproject;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int n)
	{
		if(n==0||n==1)
			  return 1;
		  return n*factorial(n-1);

	}

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
  System.out.println("enter a number :");
  int num=sc.nextInt();
  int n;
  System.out.println("factorial of "+num+" is :"+factorial(num));
 
	}

}
