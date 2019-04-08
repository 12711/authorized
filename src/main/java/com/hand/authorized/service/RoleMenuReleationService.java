package com.hand.authorized.service;

import com.hand.authorized.domain.Role;
import com.hand.authorized.domain.RoleMenuReleation;
import com.hand.hap.cloud.mybatis.service.BaseService;

import java.util.List;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
public interface RoleMenuReleationService extends BaseService<RoleMenuReleation>{
    RoleMenuReleation create(RoleMenuReleation roleMenuReleation);
}
