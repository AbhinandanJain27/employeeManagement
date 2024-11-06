package com.abhinandan.employeeManagment.Vaidators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = GenderValidator.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidGender {
    String message() default "Please Specify THe Correct Gender";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
