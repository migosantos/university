package com.university.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.university.rest.SchoolClassEndPoint;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        registerEndpoints();
    }
    
    private void registerEndpoints() {
    	register(SchoolClassEndPoint.class);
    }
}