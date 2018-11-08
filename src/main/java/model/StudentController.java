package model;

import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

import json.JSONParser;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

public class StudentController {
	private static final String API_NOTITAS = "http://localhost:9000";
	private static final String API_TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiSnVhbiBJZ25hY2lvIEN1aXVsZSIsImlkIjoxNTg5Mzg2fQ.BOqhX4la_zzMxYtp4mdXDIcrYwTi-oP9cBOVHjP55ls";

	private static Builder makeRequest(String path) {
		WebResource recurso = Client.create().resource(API_NOTITAS).path(path);
		return recurso.header(HttpHeaders.AUTHORIZATION, "Bearer " + API_TOKEN).accept(MediaType.APPLICATION_JSON);
	}

	public Student getStudent() {
		String response = StudentController.makeRequest("student").get(ClientResponse.class).getEntity(String.class);
		return JSONParser.fromJson(response, Student.class);
	}

	public List<Assignment> getAssignments() {
		String response = StudentController.makeRequest("student/assignments").get(ClientResponse.class)
				.getEntity(String.class);
		Type listType = new TypeToken<ArrayList<Assignment>>() {
		}.getType();
		return JSONParser.fromJson(response, listType);
	}

	public void updateStudent(Student student) {
		String jsonStudent = JSONParser.toJson(student);
		String response = StudentController.makeRequest("student").put(ClientResponse.class, jsonStudent)
				.getEntity(String.class);
		System.out.println(response);
	}
}