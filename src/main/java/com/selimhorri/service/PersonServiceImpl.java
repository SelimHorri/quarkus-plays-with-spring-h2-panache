package com.selimhorri.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selimhorri.dao.PersonDao;
import com.selimhorri.model.Person;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	@Override
	public List<Person> findAll() {
		return this.personDao.findAll();
	}
	
	@Override
	public Person findById(Long personId) {
		return this.personDao.findById(personId);
	}
	
	@Override
	public void save(Person person) {
		this.personDao.save(person);
	}
	
	@Override
	public void update(Person person) {
		this.personDao.update(person);
	}
	
	@Override
	public void deleteById(Long personId) {
		this.personDao.deleteById(personId);
	}
	
	
	
}





