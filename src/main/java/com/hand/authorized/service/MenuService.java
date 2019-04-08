package com.hand.authorized.service;

import com.hand.authorized.data.Router;
import com.hand.authorized.domain.Menu;
import com.hand.authorized.utils.Response;
import com.hand.authorized.utils.ResponseUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */

public interface MenuService {

    /**
     * 新增菜单
     * @param menu
     * @return
     */
    Menu createMenu(@RequestBody Menu menu);

    /**
     * 更新菜单
     * @param menu
     * @return
     */
     Response updateMenu(@RequestBody Menu menu);

    /**
     * 通过ID获取菜单
     * @param id
     * @return
     */
    Response getMenuById(@PathVariable("id") Integer id);

    /**
     * 获取菜单列表
     * @return
     */
     Response list();

    /**
     * 获取用户的菜单
     * @param userName
     * @return
     */
    Router listForCurrentUser();

    /**
     * 获取子菜单
     * @param parentId
     * @return
     */
    List<Menu> getAllChildrenMenu(Integer parentId);



    /**
     * 获取子菜单
     * @param
     * @return
     */
    void getRoleCodeForMenu(Integer menuId,Router router);
}
