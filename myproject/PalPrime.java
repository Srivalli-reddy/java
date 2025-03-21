package myproject;

import java.util.Scanner;

public class PalPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int n=sc.nextInt();
		int total=n;
		int sum=0;
		int count=0;
		int rev;
		while(n!=0)
		{
			rev=n%10;
			sum=sum*10+rev;
			n=n/10;
		}
		if(sum==total)
		{
			System.out.println(sum+" is a palindrome");
		}
		else
		{
			System.out.println(sum+" is not a palindrome");
		}
		for(int i=1;i<=total;i++)
		{
			if(total%i==0)
			{
				count++;
			}
		}
		if(count==2) {
			System.out.println("it is a prime");
		}
		else
		{
			System.out.println("it is not a prime");
		}
		if(sum==total && count==2)
		{
			System.out.println("it's a palprime");
		}
		else
		{
			System.out.println("it's not a palprime");
		}
}

}
