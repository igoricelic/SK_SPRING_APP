package rs.raf.skapp.domain.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;

@Data
public class UserReqDto {

    private String firstName;

    private String lastName;

    @Email(message = "Email je obavezan!")
    private String email;

    @Length(min = 8, max = 16, message = "Password 8 do 16")
    private String password;

}
