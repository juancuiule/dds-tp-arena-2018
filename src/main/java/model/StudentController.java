package model;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import json.JSONParser;

import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

public class StudentController {
    private Client client;
    private static final String API_NOTITAS = "http://notitas.herokuapp.com/";
    private static final String API_TOKEN = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho";

    public StudentController() {
        this.client = Client.create();
    }

    public Student getStudent(){
        WebResource recurso = this.client.resource(API_NOTITAS).path("student");
        ClientResponse response = recurso
        		.header(HttpHeaders.AUTHORIZATION, "Bearer " + API_TOKEN)
        		.accept(MediaType.APPLICATION_JSON)
        		.get(ClientResponse.class);
        String string = response.getEntity(String.class);
        return JSONParser.parseStudent(string);
    }
    
    public List<Assignment> getAssignments(){
        WebResource recurso = this.client.resource(API_NOTITAS).path("student/assignments");
        ClientResponse response = recurso
        		.header(HttpHeaders.AUTHORIZATION, "Bearer " + API_TOKEN)
        		.accept(MediaType.APPLICATION_JSON)
        		.get(ClientResponse.class);
        String string = response.getEntity(String.class);
        return JSONParser.parseAssignments(string);
    }
}