package oops;

public class Frequency {
	

	
		public static void main(String[] args) {
			String s="apple";
			int[]a=new int[26];
			for(char ch:s.toCharArray())
			{
				a[ch-'a']++;
			}
			for (int i=0;i<a.length;i++)
			{
				if(a[i]!=0)
				{
					char ch=(char)(i+97);
					System.out.println(ch + " "+a[i]);
				}
			}
		}

	


}
