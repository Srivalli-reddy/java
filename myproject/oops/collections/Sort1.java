package collections;


	import java.util.*;

	class Student {
	    String name;
	    int age;

	    
	    public Student(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    
	    @Override
	    public String toString() {
	        return name + " (" + age + ")";
	    }

	    
	    public static Comparator<Student> NameComparator = new Comparator<Student>() {
	        @Override
	        public int compare(Student s1, Student s2) {
	            return s1.name.compareTo(s2.name); 
	        }
	    };
public class Sort1
{
	    public static void main(String[] args) {
	       
	        List<Student> students = new ArrayList<>();
	        students.add(new Student("van", 22));
	        students.add(new Student("ran", 19));
	        students.add(new Student("man", 21));

	        
	        System.out.println("Before Sorting (by Name):");
	        for (Student student : students) {
	            System.out.println(student);
	        }

	        
	        Collections.sort(students, Student.NameComparator);

	        
	        System.out.println("\nAfter Sorting (by Name):");
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }
	}
	}

	


