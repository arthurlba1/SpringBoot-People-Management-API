package management.people.people_management_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import management.people.people_management_api.dto.MessageResponseDTO;
import management.people.people_management_api.entity.Person;
import management.people.people_management_api.service.PersonService;

/*
 * Control class from person to REST layer.
 */
@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

 private PersonService personService;

 @Autowired
 public PersonController(PersonService personService) {
    this.personService = personService;
 }

 /*
  * Method to create a new person.
  */
 @PostMapping
 @ResponseStatus(HttpStatus.CREATED)
 public MessageResponseDTO createPerson (@RequestBody Person person) {
    return personService.createPerson(person);
 }
}
