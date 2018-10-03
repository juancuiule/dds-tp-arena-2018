package model;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import json.JSONParser;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

public class StudentController {
    private static final String API_NOTITAS = "http://notitas.herokuapp.com/";
    private static final String API_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";

    public StudentController() {}
    
    private static String makeRequest(String path) {
    	WebResource recurso = Client.create().resource(API_NOTITAS).path(path);
        ClientResponse response = recurso
        		.header(HttpHeaders.AUTHORIZATION, "Bearer " + API_TOKEN)
        		.accept(MediaType.APPLICATION_JSON)
        		.get(ClientResponse.class);
        String string = response.getEntity(String.class);
        return string;
    }

    public Student getStudent(){
        String response = StudentController.makeRequest("student");
        return JSONParser.parseStudent(response);
    }
    
    public List<Assignment> getAssignments(){
        String response = StudentController.makeRequest("student/assignments");
        return JSONParser.parseAssignments(response);
    }
}