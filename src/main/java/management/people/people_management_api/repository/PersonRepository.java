package management.people.people_management_api.repository;

import management.people.people_management_api.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, String> {
}
