package com.hand.authorized.mapper;

import com.hand.authorized.domain.Role;
import com.hand.authorized.domain.User;
import com.hand.hap.cloud.mybatis.common.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
public interface RoleMapper extends BaseMapper<Role> {
    List<Role> getRoleListByIds(@Param("ids") String ids);
}
