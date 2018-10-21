package com.university.validators.annotations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.university.entities.Student;
import com.university.respository.StudentRepository;

public class StudentValidator implements ConstraintValidator<ValidStudent, Student> {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public void initialize(ValidStudent constraintAnnotation) {
	}

	@Override
	public boolean isValid(Student student, ConstraintValidatorContext context) {
		return !studentRepository.existsById(student.getLastName());
	}
}