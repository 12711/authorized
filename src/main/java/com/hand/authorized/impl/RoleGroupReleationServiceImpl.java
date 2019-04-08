package com.hand.authorized.impl;

import com.hand.authorized.domain.Menu;
import com.hand.authorized.domain.RoleGroupReleation;
import com.hand.authorized.domain.RoleMenuReleation;
import com.hand.authorized.service.MenuService;
import com.hand.authorized.service.RoleGroupReleationService;
import com.hand.authorized.utils.CommonUtils;
import com.hand.authorized.utils.Response;
import com.hand.hap.cloud.mybatis.service.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
@Service
public class RoleGroupReleationServiceImpl extends BaseServiceImpl<RoleGroupReleation> implements RoleGroupReleationService {
    @Override
    public RoleGroupReleation create(RoleGroupReleation roleGroupReleation) {
        CommonUtils.checkoutUnique(this,new RoleGroupReleation().setGroupId(roleGroupReleation.getGroupId())
                .setRoleId(roleGroupReleation.getRoleId()),"the releation ");
        insert(roleGroupReleation);
        return roleGroupReleation;
    }

    @Override
    public List<RoleGroupReleation> findAllByUserId(Integer userId) {
        return null;
    }

    @Override
    public List<RoleGroupReleation> findAllByGroupId(Integer groupId) {
        return select(new RoleGroupReleation().setGroupId(groupId).setEnabled(true));
    }
}
