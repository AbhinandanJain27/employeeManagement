package com.abhinandan.employeeManagment.Repository;

import com.abhinandan.employeeManagment.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository <Employee, String> {
    @Query("SELECT MAX(e.Id) FROM Employee e")
    String findMaxEmployeeId();
}
