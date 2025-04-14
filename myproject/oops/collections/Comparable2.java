package collections;
import java.util.*;
 


	class Person implements Comparable<Person> {
	    String name;
	    int age;

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    
	    @Override
	    public int compareTo(Person p) {
	        return Integer.compare(this.age,p.age);
	    }

	    @Override
	    public String toString() {
	        return name + " (" + age + ")";
	    }
	}

	public class Comparable2{
	    public static void main(String[] args) {
	        List<Person> people = new ArrayList<>();
	        people.add(new Person("A", 30));
	        people.add(new Person("B", 25));
	        people.add(new Person("C", 35));

	        
	        Collections.sort(people);

	        System.out.println("Sorted people: " + people);
	    }
	}



