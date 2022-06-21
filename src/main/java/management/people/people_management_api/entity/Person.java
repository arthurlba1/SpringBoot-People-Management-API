package management.people.people_management_api.entity;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    
    private String cpf;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;
    
    private List<Phone> phones;
}
