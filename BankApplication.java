package Package;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		int balance=0;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n 1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. End");
			System.out.println("Enter your choice : ");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter your deposit amount : ");
				int amount=sc.nextInt();
				balance +=amount;
				System.out.println("Deposited : "+amount);
			}
			else if(choice==2)
			{
				System.out.println("Enter your Withdrawn amount: ");
				double amount=sc.nextDouble();
				if(amount<=balance)
				{
					balance-=amount;
					System.out.println("Withdrawn: "+amount);
				}
				else
				{
					System.out.println("Insufficient funds!");
				}
				}
			else if(choice==3)
			{
				System.out.println("Curent balance: "+balance);
			}
			else
			{
				System.out.println("Invalid choice");
				break;
			}
		}

	}

}
