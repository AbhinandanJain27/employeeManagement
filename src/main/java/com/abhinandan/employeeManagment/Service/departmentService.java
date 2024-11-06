package com.abhinandan.employeeManagment.Service;

import com.abhinandan.employeeManagment.Entity.Department;

import java.util.Optional;

public interface departmentService {
    Department saveDepartment(Department department);
    Optional<Department> findByName(String name);
}
