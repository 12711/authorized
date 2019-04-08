package com.hand.authorized.domain;

import com.hand.hap.cloud.mybatis.domain.AuditDomain;

import javax.persistence.Id;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:27 PM
 */
public class User extends AuditDomain {
    @Id
    private Integer id;
    private String userName;
    private String password;
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public User setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }
}
