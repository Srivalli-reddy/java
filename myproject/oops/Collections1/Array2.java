package Collections1;
import java.util.ArrayList;
public class Array2 {


    public static void main(String[] args) {
      
        ArrayList<String> l = new ArrayList<>();
         l.add("Java");
        l.add("Python");
        l.add("C++");
      System.out.println("First element: " + l.get(0));  
        l.set(2, "Ruby"); 
        l.remove("Python"); 
        System.out.println("Updated ArrayList:");
        for (String language : l) {
            System.out.println(language);
        }
    }
}



