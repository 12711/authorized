package com.hand.authorized.controller;

import com.hand.authorized.domain.UserGroup;
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
 * @create 2019-04-03-2:05 PM
 */
@RestController
@RequestMapping("/v1/group")
public class UserGroupController {

    @Autowired
    private UserGroupService userGroupService;

    @PostMapping
    public Response create(@RequestBody UserGroup userGroup) {
        return ResponseUtils.success("", userGroupService.create(userGroup));
    }
}
