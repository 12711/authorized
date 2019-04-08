package com.hand.authorized.controller;

import com.hand.authorized.domain.UserRoleReleation;
import com.hand.authorized.service.UserRoleReleationService;
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
 * @create 2019-04-03-2:28 PM
 */
@RestController
@RequestMapping("/v1/userRoleReleation")
public class UserRoleReleationController {

    @Autowired
    private UserRoleReleationService userRoleReleationService;

    @PostMapping
    public Response craete(@RequestBody UserRoleReleation userRoleReleation){
        return ResponseUtils.success("",userRoleReleationService.create(userRoleReleation));
    }
}
