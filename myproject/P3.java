package myproject;

public class P3 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("*");
			}
			for(int k=1;k<=(2*i-1);k++) {
				System.out.print(" ");	
			}
			System.out.println();
		}

	}

}
