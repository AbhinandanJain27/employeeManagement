package com.abhinandan.employeeManagment.Service.IMPL;

import com.abhinandan.employeeManagment.Entity.Department;
import com.abhinandan.employeeManagment.Repository.departmentRepository;
import com.abhinandan.employeeManagment.Service.departmentService;
import com.abhinandan.employeeManagment.Utility.IdGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class departmentServiceIMPL implements departmentService {
    @Autowired
    private departmentRepository departmentRepository;

    @Autowired
    private IdGeneratorService idGeneratorService;

    @Override
    public Department saveDepartment(Department department) {
        department.setId(idGeneratorService.generateDepartmentId());
        return departmentRepository.save(department);
    }

    @Override
    public Optional<Department> findByName(String name) {
        return departmentRepository.findByName(name);
    }
}
