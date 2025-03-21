package myproject;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter "+ n+" elements of the array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
   System.out.println("enter the sum : ");
   int sum=sc.nextInt();
   boolean pairfound=false;
   for(int i=0;i<arr.length;i++)
   {
	   for(int j=i+1;j<arr.length;j++)
	   {
		   if(arr[i]==sum)
		   {
			   pairfound=true;
			   break;
		   }
	   }
	   if(pairfound)
	   {
		   break;
	   }
   }
   if (pairfound) {
       System.out.println("A pair exists that sums to " + sum);
   } else {
       System.out.println("No pair exists that sums to " + sum);
	}

}
}
