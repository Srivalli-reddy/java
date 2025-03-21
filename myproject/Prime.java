package myproject;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digit : ");
		int num=sc.nextInt();
		 int count=0;
		for(int i=1;i<num;i++)
		if(num%i==0)
			
		{
			count++;
		}
			if(num==2) {
				
			
			System.out.println(num+"is a prime");
		}
			else {
				System.out.println(num+" not a prime");
				
			}
		}
		
		
		
		
	}


