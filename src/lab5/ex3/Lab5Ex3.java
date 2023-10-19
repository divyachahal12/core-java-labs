package lab5.ex3;

public class Lab5Ex3 {
	public static void main(String[] args) {
        Employee employee = new Employee("Divya", 2000);

        try {
            employee.validateSalary();
            System.out.println("Salary is valid.");
        } catch (EmployeeException e) {
            System.err.println("Employee Exception: " + e.getMessage());
        }
    }
}
