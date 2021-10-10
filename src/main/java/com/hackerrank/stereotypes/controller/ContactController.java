package com.hackerrank.stereotypes.controller;

import com.hackerrank.stereotypes.model.Person;
import com.hackerrank.stereotypes.service.ContactService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
@RestController
public class ContactController {
    ContactService contactService;

	@PostMapping("/contact/save")
    public ResponseEntity<Person> save(Person person){
        Person saved = contactService.save(person);
        return new ResponseEntity(saved, HttpStatus.CREATED);
    }

	@GetMapping("/contact/retrieve/{id}")
    public ResponseEntity<Person> retrieve(@PathVariable Integer id){
        Person person = contactService.retrieve(id);
        return new ResponseEntity(person, HttpStatus.OK);
    }
}
