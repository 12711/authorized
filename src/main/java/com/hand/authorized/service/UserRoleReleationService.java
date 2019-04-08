package com.hand.authorized.service;

import com.hand.authorized.domain.RoleMenuReleation;
import com.hand.authorized.domain.User;
import com.hand.authorized.domain.UserRoleReleation;
import com.hand.hap.cloud.mybatis.service.BaseService;

import java.util.List;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
public interface UserRoleReleationService extends BaseService<UserRoleReleation>{
    UserRoleReleation create(UserRoleReleation userRoleReleation);
    List<UserRoleReleation> findAllByUserId(Integer userId);
}
