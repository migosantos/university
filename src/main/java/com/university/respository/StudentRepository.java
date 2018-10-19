package com.university.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.university.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
	
}

