package com.university.service;

import java.util.List;

import com.university.entities.Student;

public interface StudentService {
	List<Student> getAllStudent();
	Student getStudent(String lastName);
	Student addStudent(Student student);
	Student addStudentToClass(String className, Student student);
	Student editStudent(Student student);
	void deleteStudent(String lastName);
}
