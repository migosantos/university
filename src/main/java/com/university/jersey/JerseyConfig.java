package com.university.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.university.rest.SchoolClassEndPoint;
import com.university.rest.StudentEndPoint;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        registerEndpoints();
    }
    
    private void registerEndpoints() {
    	register(SchoolClassEndPoint.class);
    	register(StudentEndPoint.class);
    }
}