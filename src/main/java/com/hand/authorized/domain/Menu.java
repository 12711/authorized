package com.hand.authorized.domain;

import com.hand.hap.cloud.mybatis.domain.AuditDomain;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:38 PM
 */
public class Menu extends AuditDomain {
    @Id
    private Integer id;
    @NotNull(message = "菜单名称")
    private String menuName;
    @NotNull(message = "路径")
    private String path;
    @NotNull(message = "图标")
    private String icon;
    @NotNull(message = "父菜单")
    private Integer parent;
    @NotNull(message = "菜单级别")
    private String level;
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public Menu setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Menu setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getMenuName() {
        return menuName;
    }

    public Menu setMenuName(String menuName) {
        this.menuName = menuName;
        return this;
    }

    public String getPath() {
        return path;
    }

    public Menu setPath(String path) {
        this.path = path;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public Menu setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public Integer getParent() {
        return parent;
    }

    public Menu setParent(Integer parent) {
        this.parent = parent;
        return this;
    }

    public String getLevel() {
        return level;
    }

    public Menu setLevel(String level) {
        this.level = level;
        return this;
    }
}
