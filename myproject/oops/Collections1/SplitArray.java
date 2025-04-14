package Collections1;
import java.util.*;
public class SplitArray {
	static void initialize(List<Integer>list,int n)
	{
		for(int i=1;i<=n;i++)
		{
			list.add(i);
		}
	}

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		int n=6;
		initialize(list,n);
		int mid=n/2;
		System.out.println(list);
		List<Integer>first=list.subList(0, mid);
		List<Integer>second=list.subList(mid, n);
		System.out.println("first"+first);
		System.out.println("second" +second);
	}

}
