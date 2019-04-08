package com.hand.authorized.service;

import com.hand.authorized.domain.UserGroup;
import com.hand.authorized.domain.UserGroupReleation;
import com.hand.hap.cloud.mybatis.service.BaseService;

import java.util.List;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
public interface UserGroupReleationService extends BaseService<UserGroupReleation>{
    UserGroupReleation create(UserGroupReleation userGroupReleation);
    List<UserGroupReleation> findAllByUserId(Integer userId);
}
