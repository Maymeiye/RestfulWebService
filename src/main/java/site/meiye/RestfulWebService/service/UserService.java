package site.meiye.RestfulWebService.service;

import site.meiye.RestfulWebService.shared.dto.UserDto;

public interface UserService {
    UserDto createUser(UserDto user);
}
