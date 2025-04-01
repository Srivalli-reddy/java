package test;

 class Bank1 {
String acntnum;
String name;
int balance;
Bank1(String acntnum,String name,int balance)
{
	this.acntnum=acntnum;
	this.name=name;
	this.balance=balance;
}
public void deposit(int amount)
{
	balance+=amount;
	System.out.println(balance);
}
public void withdraw(int amount)
{
	if(balance>=amount)
		balance-=amount;
	System.out.println(balance);
}
}
class Savings extends Bank1{
	

Savings(String acntnum, String name, int balance) {
		super(acntnum, name, balance);
		// TODO Auto-generated constructor stub
	}

int interest=5;

public void display()
{
	balance+=balance*interest/100;
	System.out.println(balance);
}
class Bank extends Savings
{

Bank(String acntnum, String name, int balance) {
		super(acntnum, name, balance);
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args)
{
Bank1 acnt=new Bank1("RT45","srinu",10000);
Savings a2=new Savings("RT45","srinu",10000);
	acnt.deposit(500);
	acnt.withdraw(700);
	
}
}
}

