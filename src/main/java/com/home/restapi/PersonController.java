package com.home.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	
	@GetMapping(value = "/rest-services/v1/persons")
	public ResponseEntity<PersonsResponse> getPersons() {
		List<Person> persons=new ArrayList<Person>();
		HttpStatus responseCode=HttpStatus.OK;
		persons=personService.getPersons();
		PersonsResponse response= new PersonsResponse();
		response.setPerson(persons);
		
		return new ResponseEntity<PersonsResponse>(response,responseCode);
		
	}
	@GetMapping(value = "/health-check")
	public ResponseEntity<String> healthCheck(){
		System.out.println("health check");
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	@GetMapping(value = "/rest-services/v1/person")
	public ResponseEntity<Person> getPerson(@RequestHeader(value = "id") String id ) {
		
		Person person=new Person();
		HttpStatus responseCode=HttpStatus.OK;
		person=personService.getPerson(id);
		
		
		return new ResponseEntity<Person>(person,responseCode);
		
	}
	
	
	@PostMapping(value = "/rest-services/v1/person")
	public ResponseEntity<Person> addPerson(@RequestBody Person person ) {
		
		Person personres=new Person();
		HttpStatus responseCode=HttpStatus.OK;
		personres=personService.addPerson(person);
		
		
		return new ResponseEntity<Person>(personres,responseCode);
		
	}
	
	@PatchMapping(value = "/rest-services/v1/person")
	public ResponseEntity<Person> addPerson(@RequestHeader(value = "id") String id, 
			@RequestBody Person person) {
		
		Person personres=new Person();
		HttpStatus responseCode=HttpStatus.OK;
		//personresp=personService.updatePerson(person);
		
		
		return new ResponseEntity<Person>(personres,responseCode);
		
	}
	
}
