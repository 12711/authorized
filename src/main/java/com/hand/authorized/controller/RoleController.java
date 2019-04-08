package com.hand.authorized.controller;

import com.hand.authorized.domain.Role;
import com.hand.authorized.service.RoleService;
import com.hand.authorized.utils.Response;
import com.hand.authorized.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-03-1:51 PM
 */
@RestController
@RequestMapping(value = "/v1/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping
    public Response create(@RequestBody Role role){
        return ResponseUtils.success("",roleService.create(role));
    }

    @GetMapping("/all/userId/{userId}")
    public Response getAllByUserName(@PathVariable("userId") Integer userId){
        return ResponseUtils.success("",roleService.getRoleListByUser(userId));
    }

}
