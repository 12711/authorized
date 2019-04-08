package com.hand.authorized.data;

import java.util.List;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-4:23 PM
 */
public class Router {
    private String path;
    private List<String> authority;
    private List<Router> routers;
    private String name;
    private String icon;

    public String getPath() {
        return path;
    }

    public Router setPath(String path) {
        this.path = path;
        return this;
    }

    public List<String> getAuthority() {
        return authority;
    }

    public Router setAuthority(List<String> authority) {
        this.authority = authority;
        return this;
    }

    public List<Router> getRouters() {
        return routers;
    }

    public Router setRouters(List<Router> routers) {
        this.routers = routers;
        return this;
    }

    public String getName() {
        return name;
    }

    public Router setName(String name) {
        this.name = name;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public Router setIcon(String icon) {
        this.icon = icon;
        return this;
    }
}
