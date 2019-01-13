package com.home.restapi;

import java.util.List;

public class PersonsResponse {
 List<Person> person;

public List<Person> getPerson() {
	return person;
}

public void setPerson(List<Person> person) {
	this.person = person;
}
}
