package com.selimhorri.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.selimhorri.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao {
	
	@Override
	public List<Person> findAll() {
		return Person.findAll().list();
	}
	
	@Override
	public Person findById(final Long personId) {
		return Person.findById(personId);	
	}
	
	@Override
	public void save(final Person person) {
		Person.persist(person);
	}
	
	@Override
	public void update(final Person person) {
		Person.persist(person);
	}
	
	@Override
	public void deleteById(final Long personId) {
		Person.deleteById(personId);
	}
	
	
	
}




