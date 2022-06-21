package management.people.people_management_api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import management.people.people_management_api.enums.State;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SpecificAddress {

    private String cep;

    private State state;

    private String city;

    private String street;
}
