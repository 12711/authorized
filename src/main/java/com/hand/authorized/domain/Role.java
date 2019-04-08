package com.hand.authorized.domain;

import com.hand.hap.cloud.mybatis.domain.AuditDomain;

import javax.persistence.Id;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:34 PM
 */
public class Role extends AuditDomain {
    @Id
    private Integer id;
    private String roleCode;
    private String roleName;
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public Role setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Role setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public Role setRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }

    public String getRoleName() {
        return roleName;
    }

    public Role setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
}
