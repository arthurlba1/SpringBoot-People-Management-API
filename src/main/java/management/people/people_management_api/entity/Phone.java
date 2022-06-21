package management.people.people_management_api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import management.people.people_management_api.enums.PhoneType;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    
    private Long phoneId;

    private PhoneType type;

    private String number;
}
