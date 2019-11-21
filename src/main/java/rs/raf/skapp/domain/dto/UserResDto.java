package rs.raf.skapp.domain.dto;

import lombok.Data;
import rs.raf.skapp.domain.User;

@Data
public class UserResDto {

    private String firstName;

    private String lastName;

    private String email;

    public UserResDto(User user) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
    }

}
