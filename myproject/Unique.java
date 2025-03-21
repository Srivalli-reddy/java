package myproject;
import java.util.Scanner;
public class Unique
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++) {
              arr[i]=sc.nextInt();		
	}
	
	for(int i=0;i<arr.length;i++)
	{
		int count=0;
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
			count++;	
			}
		}
		if(count==1) {
			System.out.println(arr[i]+" is unique ");
		
		}
	}
	}
}


	
