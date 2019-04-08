package com.hand.authorized.impl;

import com.hand.authorized.domain.UserGroupReleation;
import com.hand.authorized.service.UserGroupReleationService;
import com.hand.authorized.utils.CommonUtils;
import com.hand.hap.cloud.mybatis.service.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
@Service
public class UserGroupReleationServiceImpl extends BaseServiceImpl<UserGroupReleation> implements UserGroupReleationService {
    @Override
    public UserGroupReleation create(UserGroupReleation userGroupReleation) {
        CommonUtils.checkoutUnique(this,new UserGroupReleation().setUserId(userGroupReleation.getUserId())
                .setGroupId(userGroupReleation.getGroupId()),"the releation ");
        insert(userGroupReleation);
        return userGroupReleation;
    }

    @Override
    public List<UserGroupReleation> findAllByUserId(Integer userId) {
        return select(new UserGroupReleation().setUserId(userId).setEnabled(true));
    }
}
