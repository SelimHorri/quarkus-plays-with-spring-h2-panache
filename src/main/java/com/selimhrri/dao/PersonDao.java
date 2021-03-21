package com.selimhrri.dao;

import java.util.List;

import com.selimhrri.model.Person;

public interface PersonDao {
	
	List<Person> findAll();
	Person findById(final Long personId);
	void save(final Person person);
	void update(final Person person);
	void deleteById(final Long personId);
	
}




