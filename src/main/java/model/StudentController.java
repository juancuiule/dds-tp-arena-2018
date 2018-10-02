package model;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

public class StudentController {
    private Client client;
    private static final String API_NOTITAS = "http://notitas.herokuapp.com/";

    public StudentController() {
        this.client = Client.create();
    }

    public ClientResponse getStudent(){
        WebResource recurso = this.client.resource(API_NOTITAS).path("student");
        WebResource.Builder builder = recurso
        		.header(HttpHeaders.AUTHORIZATION, "Bearer " + "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiIxMTEyMjIzMzMiLCJybmQiOiJ5SXNmZFIwN2lIR3BRRmVjYU9KT2VRPT0ifQ.9pVJGUXhrJPQ-TptNCt971l0h_1dWqWgMrHAWXJchho")
        		.accept(MediaType.APPLICATION_JSON);
        ClientResponse response = builder.get(ClientResponse.class);
        return response;
    }
}