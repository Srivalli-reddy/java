package oops;

public class StringSwapping 
{
	public void swap() {
		
      String s="valli";
      String a=" ";
   if(s.length()%2==0)
{
	for(int i=0;i<s.length()-1;i++)
	{
	a=a+s.charAt(i+1)+s.charAt(i);
	i++;
	}
	System.out.println(a);
}
   else
   {
	   for(int i=0;i<s.length()-1;i++)
	   {
		   a=a+s.charAt(i+1)+s.charAt(i);
			i++;  
	   }
	   System.out.println(a+s.charAt(s.length()-1));
   }
}
	public static void main(String[] args)
	{
		StringSwapping s=new StringSwapping();
		s.swap();
		
	}	
}
