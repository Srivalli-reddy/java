package myproject;

public class Palindrome {

	public static void main(String[] args) {
	int r,sum=0;
	 int temp=0;
	 int n=45;
	 temp=n;
	 while(n!=0)
	 {
		 r=n%10;
		 sum=(sum*10)+r;
		 n=n/10;
	 }
	 if(temp==sum)
	 
		 System.out.println("palindrome number");
		 else
		 
			 System.out.println("not a palindrome");
		 
	 
	}

}
