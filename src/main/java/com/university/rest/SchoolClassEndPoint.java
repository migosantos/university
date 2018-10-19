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

import com.university.entities.SchoolClass;
import com.university.service.SchoolClassService;

@Component
@Path("/schoolclass")
@CrossOrigin(origins = "http://localhost:4200")
public class SchoolClassEndPoint {
	
	@Autowired
	private SchoolClassService schoolClassService;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<SchoolClass> findAll() {
    	List<SchoolClass> result = schoolClassService.getAllSchoolClass();
        return result;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{className}")
    public SchoolClass getByPk(@PathParam("className") String className) {
    	SchoolClass schoolClass = schoolClassService.getSchoolClass(className);
    	return schoolClass;
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public SchoolClass create(SchoolClass schoolClass) {
    	return schoolClassService.addSchoolClass(schoolClass);
    }    

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{className}")
    public SchoolClass edit(SchoolClass schoolClass) {
    	return schoolClassService.editSchoolClass(schoolClass);
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{className}")
    public void deleteByPk(@PathParam("className") String className) {
    	schoolClassService.deleteSchoolClass(className);
    }
}