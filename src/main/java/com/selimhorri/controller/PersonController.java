package com.selimhorri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selimhorri.model.Person;
import com.selimhorri.service.PersonService;

@RestController
@RequestMapping(value = {"/persons"})
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping(value = {""})
	public ResponseEntity<List<Person>> findAll() {
		return new ResponseEntity<>(this.personService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = {"/{personId}"})
	public ResponseEntity<Person> findById(@PathVariable("personId") final String personId) {
		return new ResponseEntity<>(this.personService.findById(Long.parseLong(personId)), HttpStatus.OK);
	}
	
	@PostMapping(value = {""})
	public ResponseEntity<?> save(@RequestBody Person person) {
		this.personService.save(person);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@PutMapping(value = {""})
	public ResponseEntity<?> update(@RequestBody final Person person) {
		this.personService.update(person);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(value = {"/{personId}"})
	public ResponseEntity<?> deleteById(@PathVariable("personId") final String personId) {
		this.personService.deleteById(Long.parseLong(personId));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
}






