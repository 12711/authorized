package com.hand.authorized.impl;

import com.hand.authorized.data.Router;
import com.hand.authorized.domain.Menu;
import com.hand.authorized.exception.DomainUniqueException;
import com.hand.authorized.service.MenuService;
import com.hand.authorized.service.RoleService;
import com.hand.authorized.utils.Response;
import com.hand.hap.cloud.mybatis.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
@Service
public class MenuServiceImpl extends BaseServiceImpl<Menu> implements MenuService {

    @Autowired
    private RoleService roleService;

    @Override
    public Menu createMenu(Menu menu) {
        //菜单名称全局唯一
        checkoutMenuName(menu.getMenuName());
        insert(menu);
        return menu;
    }

    @Override
    public Response updateMenu(Menu menu) {
        return null;
    }

    @Override
    public Response getMenuById(Integer id) {
        return null;
    }

    @Override
    public Response list() {
        return null;
    }


    private static final String FIRST_LEVEL_MENU = "F";

    @Override
    public Router listForCurrentUser() {
        List<Menu> firstLevelMenu = getAllFirstLevelMenu();
        return initMenuTree(firstLevelMenu);
    }

    public Router initMenuTree(List<Menu> firstLevelMenuList){
        //根路由，下级为一个以及菜单
        Router rootRouter = new Router();
        if(!CollectionUtils.isEmpty(firstLevelMenuList)){
            List<Router> firstLevelRouter = new ArrayList<>();
            Router router = null;
            for(Menu it : firstLevelMenuList){
                router = new Router();
                //填充子菜单
                wrapChildrenMenu(it,router);
                getRoleCodeForMenu(it.getId(),router);
                firstLevelRouter.add(router);

            }
            rootRouter.setRouters(firstLevelRouter);
        }


        return rootRouter;
    }


    public void wrapChildrenMenu(Menu parentMenu,Router router){
        router.setIcon(parentMenu.getIcon());
        router.setName(parentMenu.getMenuName());
        router.setPath(parentMenu.getPath());

        List<Menu> childrenMenuList =  getAllChildrenMenu(parentMenu.getId());

        if(!CollectionUtils.isEmpty(childrenMenuList)){
            Router childrenRouter = null;
            List<Router> childrenRouterList = new ArrayList<>();
            for(Menu menu : childrenMenuList){
                childrenRouter = new Router();
                //封装菜单对应的转入权限
                getRoleCodeForMenu(menu.getId(),childrenRouter);
                //分装菜单的子菜单
                wrapChildrenMenu(menu,childrenRouter);
                childrenRouterList.add(childrenRouter);
            }
            router.setRouters(childrenRouterList);
        }
    }

    /**
     * 获取系统中所有的一级菜单
     * @return
     */
    public List<Menu> getAllFirstLevelMenu(){
        List<Menu> firstLevelMenu = select(new Menu().setLevel(FIRST_LEVEL_MENU).setEnabled(true));
        return firstLevelMenu;
    }

    @Override
    public List<Menu> getAllChildrenMenu(Integer parentId) {
        List<Menu> menuList = select(new Menu().setParent(parentId).setEnabled(true));
        return menuList;
    }

    @Override
    public void getRoleCodeForMenu(Integer menuId,Router router) {
        router.setAuthority(roleService.getRoleListByMenu(menuId));
    }


    public void checkoutMenuName(String menuName){
        if(!CollectionUtils.isEmpty(select(new Menu().setMenuName(menuName)))){
            throw new DomainUniqueException("the menu is exist for menuName : " + menuName );
        }
    }
}
