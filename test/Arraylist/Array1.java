package Arraylist;
import java.util.ArrayList;
public class Array1 {

	public static void main(String[] args) {
		ArrayList n=new ArrayList();
		ArrayList a=new ArrayList();
		n.add(1);
		n.add("vedaa");
		n.add(45);
		System.out.println(n);
		System.out.println(n.isEmpty());
		System.out.println(n.indexOf(1));
		a.add(4);
	    a.add(56);
	    a.add("die");
	    System.out.println(a);
	a.addAll(n);
	System.out.println(a);
	}

}
