package com.abhinandan.employeeManagment.Service;

import com.abhinandan.employeeManagment.Entity.Employee;

import java.util.List;
import java.util.Optional;

public interface employeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(String id);
}
