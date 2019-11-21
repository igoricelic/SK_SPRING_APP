package rs.raf.skapp.service;

import rs.raf.skapp.domain.dto.LoginDto;
import rs.raf.skapp.domain.dto.UserResDto;

public interface AuthService {

    UserResDto login(LoginDto loginDto);

}
