package com.hand.authorized.service;

import com.hand.authorized.domain.RoleMenuReleation;
import com.hand.authorized.domain.UserGroup;
import com.hand.hap.cloud.mybatis.service.BaseService;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
public interface UserGroupService extends BaseService<UserGroup>{
    UserGroup create(UserGroup userGroup);
}
