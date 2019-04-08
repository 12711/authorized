package com.hand.authorized.impl;

import com.hand.authorized.domain.UserGroup;
import com.hand.authorized.service.UserGroupService;
import com.hand.authorized.utils.CommonUtils;
import com.hand.hap.cloud.mybatis.service.BaseService;
import com.hand.hap.cloud.mybatis.service.BaseServiceImpl;
import org.springframework.stereotype.Service;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
@Service
public class UserGroupServiceImpl extends BaseServiceImpl<UserGroup> implements UserGroupService {
    @Override
    public UserGroup create(UserGroup userGroup) {
        insert(userGroup);
        return userGroup;
    }
}
