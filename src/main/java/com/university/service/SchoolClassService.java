package com.university.service;

import java.util.List;

import com.university.entities.SchoolClass;
import com.university.entities.Student;

public interface SchoolClassService {	
	List<SchoolClass> getAllSchoolClass();
	SchoolClass getSchoolClass(String className);
	SchoolClass addSchoolClass(SchoolClass schoolClass);
	SchoolClass editSchoolClass(SchoolClass schoolClass);
	void deleteSchoolClass(String className);
	List<Student> getAllStudentByClass(String className);
}
