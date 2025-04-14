package collections;


	import java.util.*;

	public class ReverseComparableExample {
	    public static void main(String[] args) {
	        List<String> words = new ArrayList<>();
	        words.add("Apple");
	        words.add("Banana");
	        words.add("Mango");
	        words.add("Orange");
	        Collections.sort(words, Collections.reverseOrder());
	        System.out.println("Sorted words in reverse order: " + words);
	    }
	}



