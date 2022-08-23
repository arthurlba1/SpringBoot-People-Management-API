package management.people.people_management_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import management.people.people_management_api.dto.MessageResponseDTO;
import management.people.people_management_api.entity.Person;
import management.people.people_management_api.repository.PersonRepository;

/*
 * Class to handle person business object.
 */
@Service
public class PersonService {
    
    private PersonRepository personRepository;
    
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID (CPF) " + savedPerson.getCpf())
                .build();
    }
}
