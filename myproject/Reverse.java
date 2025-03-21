package myproject;

public class Reverse {

	public static void main(String[] args) {
		int num=123456,reverse=0;
		System.out.println("original num :"+ num);
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num/=10;
		}
System.out.println("reverse number :" +reverse);
	}

}
