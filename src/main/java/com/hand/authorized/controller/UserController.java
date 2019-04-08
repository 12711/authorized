package com.hand.authorized.controller;

import com.hand.authorized.domain.User;
import com.hand.authorized.service.UserService;
import com.hand.authorized.utils.Response;
import com.hand.authorized.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-03-1:57 PM
 */
@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Response create(@RequestBody User user){
        return ResponseUtils.success("",userService.create(user));
    }
}
