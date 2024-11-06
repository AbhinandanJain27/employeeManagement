package com.abhinandan.employeeManagment.Repository;

import com.abhinandan.employeeManagment.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface addressRepository extends JpaRepository<Address, Long> {

}
