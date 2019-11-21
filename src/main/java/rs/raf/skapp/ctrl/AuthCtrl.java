package rs.raf.skapp.ctrl;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.raf.skapp.domain.dto.LoginDto;
import rs.raf.skapp.domain.dto.UserResDto;
import rs.raf.skapp.service.AuthService;

@RestController
@RequestMapping(value = "/auth")
@RequiredArgsConstructor
public class AuthCtrl {

    private final AuthService authService;

    @PostMapping("/login")
    public UserResDto login(@Validated @RequestBody LoginDto loginDto) {
        return authService.login(loginDto);
    }

}
