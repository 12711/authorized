package com.hand.authorized.service;

import com.hand.authorized.domain.Role;
import com.hand.authorized.domain.RoleGroupReleation;
import com.hand.hap.cloud.mybatis.service.BaseService;

import java.util.List;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
public interface RoleService extends BaseService<Role>{

    List<Role> getRoleListByUser(Integer userId);

    List<Role> getRoleListByIds(String roleIds);

    List<String> getRoleListByMenu(Integer menuId);

    Role create(Role role);
}
