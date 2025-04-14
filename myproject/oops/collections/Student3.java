package collections;
import java.util.*;

	
 class Student2 implements Comparable<Student2> {
	    String name;
	    int age;

	    
	    public Student2(String name, int age) {
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
public class Student1
{
	
	    public static void main(String[] args) {
	        List<Student2> students = new ArrayList<>();
	        students.add(new Student2("Alice", 22));
	        students.add(new Student2("Bob", 19));
	        students.add(new Student2("Charlie", 21));

	        
	        Collections.sort(students);

	        
	        System.out.println("Students sorted by age:");
	        for (Student2 student : students) {
	            System.out.println(student);
	        }
	    }
	}


}
