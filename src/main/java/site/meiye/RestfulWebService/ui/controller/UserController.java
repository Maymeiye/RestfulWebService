package site.meiye.RestfulWebService.ui.controller;


import org.springframework.web.bind.annotation.*;
import site.meiye.RestfulWebService.ui.model.request.UserDetailsRequestModel;
import site.meiye.RestfulWebService.ui.model.response.UserRest;

import javax.validation.Valid;

@RestController
@RequestMapping("users")// http://localhost:8080/users
public class UserController {

    @GetMapping
    public String getUser(){
        return "get user was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails){

        return null;
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
