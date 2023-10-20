package lab4.exc2.service;

import lab4.exc2.bean.Employee;

public interface EmployeeService {
    void getEmployeeDetails(Employee employee);
    void findInsuranceScheme(Employee employee);
    void displayEmployeeDetails(Employee employee);
}