package com.home.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl implements PersonService {
	
	public static List<Person> persons=new ArrayList<Person>();

	public Person getPerson(String id) {
		Person person=new Person();
		
		for(Person person1:persons) {
			System.out.println("in for loop "+ person1.getId());
			if(person1.getId().equals(id)) {
				/*Person person=new Person();
				person.setId(id);
				person.setName(person1.getName());
				person.setAge(person1.getAge());
				person.setAddress(person1.getAddress());
				person.setPhoneNumber(person1.getPhoneNumber());*/
				return person1;
				
			}
		}
		return person;
	}

	public List<Person> getPersons() {
		
		/*Person person=new Person();
		person.setId("1000");
		person.setName("Srini");
		person.setAge(46);
		person.setAddress("16820 Wuttke Crossing Eden Praire");
		
		Person person1=new Person();
		person1.setId("1001");
		person1.setName("Sridevi");
		person1.setAge(44);
		person1.setAddress("16820 Wuttke Crossing Eden Praire");
		
		persons.add(person);
		persons.add(person1);*/
		return persons;
	}

	public Person addPerson(Person person) {
		persons.add(person);
		return person;
	}

	public Person updatePerson(Person person) {
		for(Person person1:persons) {
			System.out.println("in for loop "+ person1.getId());
			if(person1.getId().equals(person.getId())) {
				
				//person1.setId(id);
				person1.setName(person1.getName());
				person.setAge(person1.getAge());
				person.setAddress(person1.getAddress());
				person.setPhoneNumber(person1.getPhoneNumber());
				return person1;
				
			}
		}
		return null;
	}

	public String deletePerson(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
