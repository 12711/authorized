package com.hand.authorized.domain;

import com.hand.hap.cloud.mybatis.domain.AuditDomain;

import javax.persistence.Id;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:36 PM
 */
public class UserGroup extends AuditDomain {
    @Id
    private Integer id;
    private  String groupName;
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public UserGroup setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public UserGroup setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public UserGroup setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
}
