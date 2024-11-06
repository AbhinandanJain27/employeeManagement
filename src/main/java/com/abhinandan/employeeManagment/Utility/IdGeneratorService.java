package com.abhinandan.employeeManagment.Utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abhinandan.employeeManagment.Repository.*;

@Service
public class IdGeneratorService {
    @Autowired
    private employeeRepository employeeRepository;

    @Autowired
    private departmentRepository departmentRepository;

    public String generateEmployeeId() {
        String maxId = employeeRepository.findMaxEmployeeId();
        if (maxId == null) {
            maxId = "E0000"; // Default starting ID if no records exist
        }
        int numericPart = Integer.parseInt(maxId.substring(1)) + 1;
        return "E" + String.format("%04d", numericPart);
    }

    public String generateDepartmentId() {
        String maxId = departmentRepository.findMaxDepartmentId();
        if (maxId == null) {
            maxId = "D000"; // Default starting ID if no records exist
        }
        int numericPart = Integer.parseInt(maxId.substring(1)) + 1;
        return "D" + String.format("%03d", numericPart);
    }
}
