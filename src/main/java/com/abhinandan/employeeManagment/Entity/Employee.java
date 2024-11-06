package com.abhinandan.employeeManagment.Entity;

import com.abhinandan.employeeManagment.Enums.Gender;
import com.abhinandan.employeeManagment.Vaidators.ValidGender;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name="employees")
public class Employee {
    @Id
    private String id;

    @NotBlank(message = "firstName can't be Null")
    private String firstName;

    @NotBlank(message = "lastName can't be Null")
    private String lastName;

    @NotBlank(message = "email can't be Null")
    private String email;

    @NotNull(message = "mobile Number can't be Null")
    private long mobileNumber;

    @ValidGender
    @Enumerated (EnumType.STRING)
    private Gender gender;

    @ManyToOne
//    @NotNull(message = "Department Can't be Blank")
    @Valid
    private Department department;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, orphanRemoval = true)
//    @NotNull(message = "Address Can't be blank")
    @Valid
    private List<Address> addresses;

}
