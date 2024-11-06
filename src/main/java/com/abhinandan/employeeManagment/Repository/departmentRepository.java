package com.abhinandan.employeeManagment.Repository;

import com.abhinandan.employeeManagment.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface departmentRepository extends JpaRepository<Department, String> {
    Optional<Department> findByName(String name);

    @Query("SELECT MAX(d.Id) FROM Department d")
    String findMaxDepartmentId();
}
