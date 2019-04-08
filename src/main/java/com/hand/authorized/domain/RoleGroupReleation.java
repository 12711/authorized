package com.hand.authorized.domain;

import javax.persistence.Id;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:38 PM
 */
public class RoleGroupReleation {
    @Id
    private Integer id;
    private Integer roleId;
    private Integer groupId;
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public RoleGroupReleation setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public RoleGroupReleation setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public RoleGroupReleation setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public RoleGroupReleation setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }
}
