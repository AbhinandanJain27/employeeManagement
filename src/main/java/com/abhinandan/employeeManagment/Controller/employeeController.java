package com.abhinandan.employeeManagment.Controller;

import com.abhinandan.employeeManagment.Entity.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.abhinandan.employeeManagment.Service.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/api/employee")
public class employeeController {

    @Autowired
    private employeeService employeeService;

    @Autowired
    private departmentService departmentService;

    @Autowired
    private addressService addressService;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @PostMapping("/registerEmployee")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        Optional<Department> department = departmentService.findByName(employee.getDepartment().getName());
        if (department.isPresent()) {
            employee.setDepartment(department.get());
        } else {
            Department newDepartment = departmentService.saveDepartment(employee.getDepartment());
            employee.setDepartment(newDepartment);
        }
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable String id) {
        return employeeService.getEmployeeById(id);
    }

}
