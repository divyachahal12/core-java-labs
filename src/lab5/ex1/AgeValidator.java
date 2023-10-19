package lab5.ex1;

public class AgeValidator {
	 public void validateAge(int age) throws AgeValidationException {
	        if (age <= 15) {
	            throw new AgeValidationException("Age should be above 15.");
	        } else {
	            System.out.println("Age is valid.");
	        }
	    }
}
