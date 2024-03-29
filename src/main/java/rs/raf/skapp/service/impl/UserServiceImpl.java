package rs.raf.skapp.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rs.raf.skapp.dao.UserDao;
import rs.raf.skapp.domain.User;
import rs.raf.skapp.domain.dto.UserReqDto;
import rs.raf.skapp.domain.dto.UserResDto;
import rs.raf.skapp.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Override
    public List<UserResDto> findAll() {
        List<User> users = userDao.findAll();
        List<UserResDto> userResDtos = new ArrayList<>();
        for(User user: users) {
            userResDtos.add(new UserResDto(user));
        }
        return userResDtos;
    }

    @Override
    public UserResDto save(UserReqDto userReq) {
        User user = User.builder().firstName(userReq.getFirstName())
                .lastName(userReq.getLastName())
                .email(userReq.getEmail())
                .password(userReq.getPassword()).build();
        userDao.save(user);
        return new UserResDto(user);
    }

}
