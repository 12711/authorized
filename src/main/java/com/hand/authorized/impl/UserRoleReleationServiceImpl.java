package com.hand.authorized.impl;

import com.hand.authorized.domain.RoleMenuReleation;
import com.hand.authorized.domain.UserRoleReleation;
import com.hand.authorized.service.UserRoleReleationService;
import com.hand.authorized.utils.CommonUtils;
import com.hand.hap.cloud.mybatis.service.BaseService;
import com.hand.hap.cloud.mybatis.service.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
@Service
public class UserRoleReleationServiceImpl extends BaseServiceImpl<UserRoleReleation> implements UserRoleReleationService {
    @Override
    public UserRoleReleation create(UserRoleReleation userRoleReleation) {
        CommonUtils.checkoutUnique(this,new UserRoleReleation().setUserId(userRoleReleation.getUserId())
                .setRoleId(userRoleReleation.getRoleId()),"the releation ");
        this.insert(userRoleReleation);
        return userRoleReleation;
    }

    @Override
    public List<UserRoleReleation> findAllByUserId(Integer userId) {
        List<UserRoleReleation> userRoleReleations = this.select(new UserRoleReleation().setUserId(userId).setEnabled(true));
        return userRoleReleations;
    }
}
