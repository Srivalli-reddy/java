package collections;
import java.util.*;

	class Student7{
	    String name;
	    int age;
      public Student7(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
         @Override
	    public String toString() {
	        return name + " (" + age + " years old)";
	    }
        public static Comparator<Student> NameComparator = new Comparator<Student>() {
	        @Override
	        public int compare(Student s1, Student s2) {
	            return s1.name.compareTo(s2.name); 
	        }
	    };
	    public class SortbyName {
	    public static void main(String[] args) {
	        
	        List<Student> students = new ArrayList<>();
	        students.add(new Student("gwen", 22));
	        students.add(new Student("Ben", 19));
	        students.add(new Student("kevin", 21));

	        
	        System.out.println("Before Sorting :");
	        for (Student student : students) {
	            System.out.println(student);
	        }

	       
	        Collections.sort(students, Student.NameComparator);

	     
	        System.out.println("\nAfter Sorting:");
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }
	}


}
