package com.university.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.university.entities.Student;
import com.university.service.StudentService;

@Component
@Path("/student")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentEndPoint {
	
	@Autowired
	private StudentService studentService;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> findAll() {
    	List<Student> result = studentService.getAllStudent();
        return result;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{lastName}")
    public Student getByPk(@PathParam("lastName") String lastName) {
    	Student student = studentService.getStudent(lastName);
    	return student;
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{lastName}")
    public Student create(Student student) {
    	return studentService.addStudent(student);
    }    
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{lastName}")
    public Student edit(Student student) {
    	return studentService.editStudent(student);
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{lastName}")
    public void deleteByPk(@PathParam("lastName") String lastName) {
    	studentService.deleteStudent(lastName);
    }
}