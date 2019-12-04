package rs.raf.skapp.ctrl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import rs.raf.skapp.dao.UserDao;
import rs.raf.skapp.domain.User;
import rs.raf.skapp.domain.dto.UserReqDto;
import rs.raf.skapp.domain.dto.UserResDto;
import rs.raf.skapp.service.UserService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserCtrl {

    private final UserService userService;

    private final UserDao userDao;

    @GetMapping("/findAll")
    public List<UserResDto> findAll() {
        return userService.findAll();
    }

    @GetMapping("/all")
    public List<User> findByDomain() {
        return userDao.findAll();
    }

    @PostMapping("/save")
    public UserResDto save(@Validated @RequestBody UserReqDto userReq) {
        return userService.save(userReq);
    }

}
