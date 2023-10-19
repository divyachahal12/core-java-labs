package lab5.ex2;

public class Lab5Ex2 {
	public static void main(String[] args) {
        NameValidator nameValidator = new NameValidator();
        String firstName = "Divya"; 
        String lastName = "";      

        try {
            nameValidator.validateFullName(firstName, lastName);
        } catch (NameValidationException e) {
            System.err.println("Name Validation Exception: " + e.getMessage());
        }
    }
}
