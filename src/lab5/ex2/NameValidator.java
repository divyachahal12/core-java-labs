package lab5.ex2;

public class NameValidator {
	public void validateFullName(String firstName, String lastName) throws NameValidationException {
        if (firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
            throw new NameValidationException("First name and last name cannot be blank.");
        } else {
            System.out.println("Full name is valid: " + firstName + " " + lastName);
        }
    }
}
