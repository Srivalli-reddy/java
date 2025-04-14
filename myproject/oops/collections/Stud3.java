
package collections;
import java.util.*;

	
 class Stud4 implements Comparable<Student2> {
	    String name;
	    int age;

	    
	    public Stud4(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    
	    @Override
	    public int compareTo(Student2 s) {
	        return Integer.compare(this.age, s.age);  
	    }

	    @Override
	    public String toString() {
	        return name + " (" + age + " years old)";
	    }
public class Stud3
{
	
	    public static void main(String[] args) {
	        List<Student2> students = new ArrayList<>();
	        students.add(new Student2("sam", 22));
	        students.add(new Student2("max", 19));
	        students.add(new Student2("bun", 21));

	        
	        Collections.sort(students);

	        
	        System.out.println("Students sorted by age:");
	        for (Student2 student : students) {
	            System.out.println(student);
	        }
	    }
	}


}



