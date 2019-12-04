package rs.raf.skapp.ctrl;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.skapp.domain.dto.LoginDto;
import rs.raf.skapp.domain.dto.UserResDto;
import rs.raf.skapp.service.AuthService;
import rs.raf.skapp.service.tokenHandlerservice;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/auth")
@RequiredArgsConstructor
public class AuthCtrl {

    private final AuthService authService;

    private final tokenHandlerservice tokenHanlderService;

    @PostMapping("/login")
    public UserResDto login(@Validated @RequestBody LoginDto loginDto) {
        return authService.login(loginDto);
    }

    @GetMapping("/getToken")
    public String getToken(String email) {
        return tokenHanlderService.getTokenByEmail(email);
    }

    @GetMapping("/getEmail")
    public String getEmail(HttpServletRequest request) {
        String token = request.getHeader("AUTH");
        System.out.println("TOkEN: "+token);
        return tokenHanlderService.getEmailByToken(token);
    }

}
