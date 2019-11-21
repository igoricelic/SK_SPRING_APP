package rs.raf.skapp.service;

import rs.raf.skapp.domain.dto.UserReqDto;
import rs.raf.skapp.domain.dto.UserResDto;

import java.util.List;

public interface UserService {

    List<UserResDto> findAll();

    UserResDto save(UserReqDto userReq);

}
