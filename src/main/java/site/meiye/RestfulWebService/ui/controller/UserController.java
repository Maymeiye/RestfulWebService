package site.meiye.RestfulWebService.ui.controller;


import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import site.meiye.RestfulWebService.service.UserService;
import site.meiye.RestfulWebService.shared.dto.UserDto;
import site.meiye.RestfulWebService.ui.model.request.UserDetailsRequestModel;
import site.meiye.RestfulWebService.ui.model.response.UserRest;

import javax.validation.Valid;

@RestController
@RequestMapping("users")// http://localhost:8080/users
public class UserController {

    @Autowired
    UserService userService;


    @GetMapping
    public String getUser(){
        return "get user was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails){

        UserRest returnValue = new UserRest();
        UserDto userDto = new UserDto();

        BeanUtils.copyProperties(userDetails, userDto);

        UserDto createUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createUser,returnValue);


        return returnValue;
    }

    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }


}
