package com.hand.authorized.domain;

import com.hand.hap.cloud.mybatis.domain.AuditDomain;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:35 PM
 */
public class UserRoleReleation extends AuditDomain {
    private Integer id;
    private Integer userId;
    private Integer roleId;
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public UserRoleReleation setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public UserRoleReleation setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public UserRoleReleation setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public UserRoleReleation setRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }
}
