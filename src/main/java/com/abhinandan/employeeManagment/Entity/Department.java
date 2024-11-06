package com.abhinandan.employeeManagment.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name="department")
public class Department {
    @Id
    private String id;

    @NotBlank(message = "Department name can't be blank")
    private String name;
}

