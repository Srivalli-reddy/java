package Package;

public class Arr1 {

	public static void main(String[] args) {
		int[] arr= {12,32,42,1,6};
			int largest=arr[0];
		for(int num:arr)
		{
			if(largest<num)
				largest= num;
		}
		System.out.println("largest element= "+largest);
	}

}
