package rs.raf.skapp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rs.raf.skapp.dao.UserDao;
import rs.raf.skapp.domain.User;
import rs.raf.skapp.domain.dto.LoginDto;
import rs.raf.skapp.domain.dto.UserResDto;
import rs.raf.skapp.service.AuthService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserDao userDao;

    @Override
    public UserResDto login(LoginDto loginDto) {
        Optional<User> optUser = userDao.findByEmailAndPassword(loginDto.getEmail(), loginDto.getPassword());
        if(optUser.isPresent()) {
            // TODO: Exception
        }
        return new UserResDto(optUser.get());
    }

}
