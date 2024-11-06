package com.abhinandan.employeeManagment.Service.IMPL;

import com.abhinandan.employeeManagment.Entity.Address;
import com.abhinandan.employeeManagment.Service.addressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abhinandan.employeeManagment.Repository.addressRepository;

import java.util.Optional;

@Service
public class addressServiceIMPL implements addressService {
    @Autowired
    private addressRepository addressRepository;

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

}
