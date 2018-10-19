package com.university.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.university.entities.SchoolClass;

@Repository
public interface SchoolClassRepository extends CrudRepository<SchoolClass, String> {
	
}
