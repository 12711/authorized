package com.hand.authorized.controller;

import com.hand.authorized.domain.Menu;
import com.hand.authorized.service.MenuService;
import com.hand.authorized.utils.Response;
import com.hand.authorized.utils.ResponseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
@RestController
@RequestMapping("/v1/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    /**
     * 新增菜单
     * @param menu
     * @return
     */
    @PostMapping
    public Response createMenu(@RequestBody Menu menu){
        return ResponseUtils.success("",menuService.createMenu(menu));
    }

    /**
     * 更新菜单
     * @param menu
     * @return
     */
    @PutMapping
    public Response updateMenu(@RequestBody Menu menu){
        return ResponseUtils.success();
    }

    /**
     * 通过ID获取菜单
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Response getMenuById(@PathVariable("id") Integer id){
        return ResponseUtils.success();
    }

    /**
     * 获取菜单列表
     * @return
     */
    @GetMapping
    public Response list(){
        return ResponseUtils.success();
    }

    /**
     * 获取用户的菜单
     * @return
     */
    @GetMapping("/init")
    public Response listForCurrentUser(){

        return ResponseUtils.success("",menuService.listForCurrentUser());
    }
}
