package lab5.ex3;

public class Employee {
	private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void validateSalary() throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary is below 3000 for employee " + name);
        }
    }
}
