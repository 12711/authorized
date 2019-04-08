package com.hand.authorized.controller;

import com.hand.authorized.domain.UserGroupReleation;
import com.hand.authorized.service.UserGroupReleationService;
import com.hand.authorized.service.UserGroupService;
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
 * @create 2019-04-02-2:54 PM
 */
@RestController
@RequestMapping("/v1/userGroupReleation")
public class UserGroupReleationController {

    @Autowired
    private UserGroupReleationService userGroupReleationService;
    @PostMapping
    public Response create(@RequestBody UserGroupReleation userGroupReleation){
        return ResponseUtils.success("",userGroupReleationService.create(userGroupReleation));
    }
}
