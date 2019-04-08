package com.hand.authorized.domain;

import com.hand.hap.cloud.mybatis.domain.AuditDomain;

import javax.persistence.Id;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:40 PM
 */
public class RoleMenuReleation extends AuditDomain {
    @Id
    private Integer id;
    private Integer roleId;
    private Integer menuId;
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public RoleMenuReleation setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public RoleMenuReleation setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public RoleMenuReleation setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public RoleMenuReleation setMenuId(Integer menuId) {
        this.menuId = menuId;
        return this;
    }
}
