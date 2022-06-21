package management.people.people_management_api.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private Long addressId;

    private String number;

    private List<SpecificAddress> cep;

    private String complement;
}
