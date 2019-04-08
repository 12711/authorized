package com.hand.authorized.domain;

import com.hand.hap.cloud.mybatis.domain.AuditDomain;

import javax.persistence.Id;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:37 PM
 */
public class UserGroupReleation extends AuditDomain {
    @Id
    private Integer id;
    private Integer userId;
    private Integer groupId;
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public UserGroupReleation setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public UserGroupReleation setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getUserId() {
        return userId;
    }

    public UserGroupReleation setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public UserGroupReleation setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }
}
