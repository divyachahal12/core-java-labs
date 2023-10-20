package lab4.exc2;

import lab4.exc2.bean.Employee;
import lab4.exc2.service.*;

public class Lab4Ex2 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        EmployeeService employeeService = new EmployeeServiceImpl();

        // Get employee details from the user
        employeeService.getEmployeeDetails(employee);

        // Find insurance scheme based on salary and designation
        employeeService.findInsuranceScheme(employee);

        // Display employee details
        employeeService.displayEmployeeDetails(employee);
    }
}