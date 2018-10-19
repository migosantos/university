package com.university.service;

import java.util.List;

import com.university.entities.Student;

public interface StudentService {
	List<Student> getAllStudent();
	Student getStudent(String lastName);
	Student addStudent(Student Student);
	Student editStudent(Student Student);
	void deleteStudent(String lastName);
//	List<SchoolClass> getAllSchoolClassByStudentLastName(String lastName);
}
