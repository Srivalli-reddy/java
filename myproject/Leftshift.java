package myproject;

public class Leftshift {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		System.out.println("original array : ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"  ");
		}
		//leftshift(arr);
		rightshift(arr);
		//System.out.println("\n array after left shift rotation : ");
		System.out.println("\n array after rightt shift rotation : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}
         //public static void leftshift(int[] arr)
	 public static void rightshift(int[] arr)
         {
        	/* int first=arr[0];
        	 for(int i=0;i<arr.length-1;i++)
        	 {
        	arr[i]=arr[i+1]; 
        		  
        	 }
        	 arr[arr.length-1]=first;*/
		 int last=arr[0];
    	 for(int i=0;i<arr.length-1;i++)
    	 {
    	arr[i]=arr[i-1]; 
    		  
    	 }
    	 arr[arr.length-1]=last;
        	
        	 }
       
}
