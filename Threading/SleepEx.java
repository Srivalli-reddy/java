package Threading;

public class SleepEx {
	 public static void main(String[] args) {
	        System.out.println("Sleeping for 2 seconds...");
	        try {
	            Thread.sleep(2000);  
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted");
	        }
	        System.out.println("Awake now!");
	    }
	}



