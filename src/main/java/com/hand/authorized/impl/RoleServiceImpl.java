package com.hand.authorized.impl;

import com.hand.authorized.domain.*;
import com.hand.authorized.exception.DomainUniqueException;
import com.hand.authorized.mapper.RoleMapper;
import com.hand.authorized.service.*;
import com.hand.hap.cloud.mybatis.service.BaseServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private UserRoleReleationService userRoleReleationService;

    @Autowired
    private RoleMenuReleationService roleMenuReleationService;

    @Autowired
    private UserGroupReleationService userGroupReleationService;

    @Autowired
    private RoleGroupReleationService roleGroupReleationService;

    @Override
    public List<Role> getRoleListByUser(Integer userId) {
        List<Role> roleList = null;
        //用户和角色直接关联
        List<UserRoleReleation> userRoleReleations = userRoleReleationService.findAllByUserId(userId);
        Set<Integer> roleIdSet = new HashSet<>();

        //用户通过用户组和角色进行关联
        List<UserGroupReleation> userGroupReleationList = userGroupReleationService.findAllByUserId(userId);
        if (!CollectionUtils.isEmpty(userGroupReleationList)) {
            for (UserGroupReleation it : userGroupReleationList) {
                List<RoleGroupReleation> roleGroupReleations = roleGroupReleationService.findAllByGroupId(it.getGroupId());
                if (!CollectionUtils.isEmpty(roleGroupReleations)) {
                    for (RoleGroupReleation item : roleGroupReleations) {
                        roleIdSet.add(item.getRoleId());
                    }
                }
            }
        }


        if (!CollectionUtils.isEmpty(userRoleReleations)) {
            for (UserRoleReleation it : userRoleReleations) {
                roleIdSet.add(it.getRoleId());
            }
        }
        if(!CollectionUtils.isEmpty(roleIdSet)){
            StringBuilder roleIdsSb = new StringBuilder();
            for(Integer roleId : roleIdSet){
                roleIdsSb.append(roleId).append(",");
            }

            int length = 0;
            if ((length = roleIdsSb.toString().length()) > 0) {
                roleList = getRoleListByIds(roleIdsSb.toString().substring(0, length - 1));
            }
        }
        return roleList;
    }

    @Override
    public List<Role> getRoleListByIds(String roleIds) {
        return roleMapper.getRoleListByIds(roleIds);
    }

    @Override
    public List<String> getRoleListByMenu(Integer menuId) {
        List<RoleMenuReleation> roleMenuReleationList = roleMenuReleationService.select(new RoleMenuReleation().setMenuId(menuId).setEnabled(true));
        List<String> roleCodeList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(roleMenuReleationList)) {
            Role role = null;
            for (RoleMenuReleation it : roleMenuReleationList) {
                role = this.selectByPrimaryKey(it.getRoleId());
                roleCodeList.add(role == null ? "" : role.getRoleCode());
            }
        }
        return roleCodeList;
    }

    @Override
    public Role create(Role role) {
        checkoutCode(role.getRoleCode());
        this.insert(role);
        return role;
    }

    /**
     * 校验角色code是否唯一
     *
     * @param roleCode
     */
    public void checkoutCode(String roleCode) {
        if (!CollectionUtils.isEmpty(select(new Role().setRoleCode(roleCode)))) {
            throw new DomainUniqueException("the role {" + roleCode + "} is exist");
        }
    }
}
