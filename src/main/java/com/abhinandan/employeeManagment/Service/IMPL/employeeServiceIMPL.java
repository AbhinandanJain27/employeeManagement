package com.abhinandan.employeeManagment.Service.IMPL;

import com.abhinandan.employeeManagment.Entity.Address;
import com.abhinandan.employeeManagment.Entity.Employee;
import com.abhinandan.employeeManagment.Repository.employeeRepository;
import com.abhinandan.employeeManagment.Service.employeeService;
import com.abhinandan.employeeManagment.Utility.IdGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class employeeServiceIMPL implements employeeService {
    @Autowired
    private employeeRepository employeeRepository;

    @Autowired
    private IdGeneratorService idGeneratorService;

    @Override
    @Transactional
    public Employee saveEmployee(Employee employee) {
        employee.setId(idGeneratorService.generateEmployeeId());
        for (Address address : employee.getAddresses()) {
            address.setEmployee(employee);
        }
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(String id) {
        return employeeRepository.findById(id);
    }
}
