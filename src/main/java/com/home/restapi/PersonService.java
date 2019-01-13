package com.home.restapi;

import java.util.List;

public interface PersonService {
	
	public Person getPerson(String id);
	
	public List<Person> getPersons();
	
	public Person addPerson(Person person);
	
	public Person updatePerson(Person person);
	
	public String deletePerson(String id);

}
