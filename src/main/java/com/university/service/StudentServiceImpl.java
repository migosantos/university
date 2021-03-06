package com.university.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.entities.SchoolClass;
import com.university.entities.Student;
import com.university.respository.SchoolClassRepository;
import com.university.respository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private SchoolClassRepository schoolClassRepository;

	@Override
	public List<Student> getAllStudent() {
		List<Student> list = new ArrayList<Student>();
		studentRepository.findAll().forEach((student) -> list.add(student));
		return list;
	}

	@Override
	public Student getStudent(String lastName) {
		return studentRepository.findById(lastName).get();
	}

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student editStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudent(String lastName) {
		studentRepository.deleteById(lastName);
	}

	@Override
	public Student addStudentToClass(String className, Student student) {
		Student result = studentRepository.save(student);
		SchoolClass schoolClass = schoolClassRepository.findById(className).get();
		schoolClass.getStudentList().add(result);
		schoolClassRepository.save(schoolClass);
		
		return result;
	}

}
