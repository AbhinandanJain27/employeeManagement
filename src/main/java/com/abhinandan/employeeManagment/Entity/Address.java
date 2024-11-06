package com.abhinandan.employeeManagment.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "House Number can't be Null")
    private String houseNumber;
    @NotBlank(message = "Street can't be Null")
    private String street;
    @NotBlank(message = "city can't be Null")
    private String city;
    @NotNull(message = "Pin code can't be Null")
    private int pinCode;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    @JsonIgnore
//    @NotNull(message = "Employee can't be blank")
    @Valid
    private Employee employee;
}
