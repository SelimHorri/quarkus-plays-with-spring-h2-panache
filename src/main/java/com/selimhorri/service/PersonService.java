package com.selimhorri.service;

import java.util.List;

import com.selimhorri.model.Person;

public interface PersonService {
	
	List<Person> findAll();
	Person findById(final Long personId);
	void save(final Person person);
	void update(final Person person);
	void deleteById(final Long personId);
	
}
