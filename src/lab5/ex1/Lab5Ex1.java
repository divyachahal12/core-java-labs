package lab5.ex1;

public class Lab5Ex1 {
	public static void main(String[] args) {
        AgeValidator ageValidator = new AgeValidator();
        int personAge = 3; // Change the age value as needed.

        try {
            ageValidator.validateAge(personAge);
        } catch (AgeValidationException e) {
            System.err.println("Age Validation Exception: " + e.getMessage());
        }
	}
}
