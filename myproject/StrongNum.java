package myproject;
import java.util.Scanner;
public class StrongNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int num=sc.nextInt();
		int total=num;
		int sum=0;
		int digit;
		int fact;
		while(total>0)
		{
			digit=total%10;
			fact=1;
			for(int i=1;i<=digit;i++)
			{
				fact=i;
			}
			sum=sum+fact;
			total=total/10;
		}
		if(sum==num)
		{
			System.out.println(num+" is a strong number");
		}
		else
		{
			System.out.println(num+" is not a strong number");
		}
		
	}

}
