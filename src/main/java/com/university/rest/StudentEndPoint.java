package com.university.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.university.entities.Student;
import com.university.service.SchoolClassService;
import com.university.service.StudentService;
import com.university.validators.annotations.ValidStudent;

@Component
@Path("api/student")
@CrossOrigin
public class StudentEndPoint {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private SchoolClassService schoolClassService;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> findAll() {
    	List<Student> result = studentService.getAllStudent();
        return result;
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("byclass/{className}")
    public List<Student> findAllByClassName(@PathParam("className") String className) {
    	List<Student> students = schoolClassService.getSchoolClass(className).getStudentList();
    	return students;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{lastName}")
    public Student getByPk(@PathParam("lastName") String lastName) {
    	Student student = studentService.getStudent(lastName);
    	return student;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("addtoclass/{className}")
    public Student create(@PathParam("className") String className,
    		@ValidStudent Student student) {
    	return studentService.addStudentToClass(className, student);
    }    
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{lastName}")
    public Student edit(Student student) {
    	return studentService.editStudent(student);
    }
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{lastName}")
    public void deleteByPk(@PathParam("lastName") String lastName) {
    	studentService.deleteStudent(lastName);
    }
}