package com.hand.authorized.impl;

import com.hand.authorized.domain.RoleMenuReleation;
import com.hand.authorized.service.RoleMenuReleationService;
import com.hand.authorized.utils.CommonUtils;
import com.hand.hap.cloud.mybatis.service.BaseServiceImpl;
import org.springframework.stereotype.Service;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
@Service
public class RoleMenuReleationServiceImpl extends BaseServiceImpl<RoleMenuReleation> implements RoleMenuReleationService {
    @Override
    public RoleMenuReleation create(RoleMenuReleation roleMenuReleation) {
        CommonUtils.checkoutUnique(this,new RoleMenuReleation().setMenuId(roleMenuReleation.getMenuId())
                .setRoleId(roleMenuReleation.getRoleId()),"the releation ");
        insert(roleMenuReleation);
        return roleMenuReleation;
    }
}
