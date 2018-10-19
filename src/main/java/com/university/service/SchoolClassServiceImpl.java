package com.university.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.entities.SchoolClass;
import com.university.entities.Student;
import com.university.respository.SchoolClassRepository;

@Service
public class SchoolClassServiceImpl implements SchoolClassService {

    @Autowired
    private SchoolClassRepository schoolClassRepository;
    
	@Override
	public List<SchoolClass> getAllSchoolClass() {
		List<SchoolClass> list = new ArrayList<SchoolClass>();
		schoolClassRepository.findAll().forEach((schoolClass) -> list.add(schoolClass));
		return list;
	}

	@Override
	public SchoolClass getSchoolClass(String className) {
		return schoolClassRepository.findById(className).get();
	}

	@Override
	public SchoolClass addSchoolClass(SchoolClass schoolClass) {
		return schoolClassRepository.save(schoolClass);
	}

	@Override
	public SchoolClass editSchoolClass(SchoolClass schoolClass) {
		return schoolClassRepository.save(schoolClass);
	}

	@Override
	public void deleteSchoolClass(String className) {
		schoolClassRepository.deleteById(className);
	}

	@Override
	public List<Student> getAllStudentByClass(String className) {
		return this.getSchoolClass(className).getStudentList();
	}

}
