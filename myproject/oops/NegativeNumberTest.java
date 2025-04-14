package oops;


	class NegativeNumberException extends Exception {
	    public NegativeNumberException(String msg) {
	        super(msg);
	    }
	}

	public class NegativeNumberTest {

	    
	    public static void checkNumber(int n) throws NegativeNumberException {
	        if (n < 0) {
	            
	            throw new NegativeNumberException("Negative number not allowed: " + n);
	        }
	        System.out.println("The number is: " + n);
	    }

	    public static void main(String[] args) {
	        
	        try {
	            checkNumber(5); 
	            checkNumber(-3); 
	        } catch (NegativeNumberException e) {
	            
	            System.out.println("Caught exception: " + e.getMessage());
	        }
	    }
	
	}



