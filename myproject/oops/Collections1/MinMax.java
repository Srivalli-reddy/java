package Collections1;
import java.util.*;
public class MinMax {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(20);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("min : "+list.get(0));
		System.out.println("max : "+list.get(list.size()-1));
	}

}
