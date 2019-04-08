package com.hand.authorized.data;

import com.hand.authorized.domain.Menu;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-4:31 PM
 */
public class MenuData {
    private Menu parent;
    private MenuData children;

    public Menu getParent() {
        return parent;
    }

    public MenuData setParent(Menu parent) {
        this.parent = parent;
        return this;
    }

    public MenuData getChildren() {
        return children;
    }

    public MenuData setChildren(MenuData children) {
        this.children = children;
        return this;
    }
}
