package myproject;

public class R2 {

	public static void main(String[] args) {
		int min=20;
		int max=40;
		System.out.println("random value b/w "+min+" to "+max+":");
		int a=(int)(Math.random()*(max-min+1)+min);
		System.out.println(a);

	}

}
