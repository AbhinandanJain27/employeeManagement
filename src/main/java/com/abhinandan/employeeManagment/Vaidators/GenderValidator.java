package com.abhinandan.employeeManagment.Vaidators;


import com.abhinandan.employeeManagment.Enums.Gender;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GenderValidator implements ConstraintValidator<ValidGender, Gender> {
    @Override
    public boolean isValid(Gender gender, ConstraintValidatorContext context) {
//        if(gender == null){
//            return false;
//        }else if(gender == Gender.Male || gender == Gender.Female){
//            return true;
//        }else{
//            return false;
//        }
        if (gender == null) {
            // Customize message for null values
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Gender must not be null")
                    .addConstraintViolation();
            return false;
        } else if (gender == Gender.Male || gender == Gender.Female) {
            return true;
        } else {
            // Customize message for invalid enum values
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Invalid gender value, must be MALE or FEMALE")
                    .addConstraintViolation();
            return false;
        }

    }
}
