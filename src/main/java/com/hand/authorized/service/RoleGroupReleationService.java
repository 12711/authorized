package com.hand.authorized.service;

import com.hand.authorized.domain.RoleGroupReleation;
import com.hand.hap.cloud.mybatis.service.BaseService;
import com.hand.hap.cloud.mybatis.service.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
public interface RoleGroupReleationService extends BaseService<RoleGroupReleation>{
    RoleGroupReleation create(RoleGroupReleation roleGroupReleation);

    List<RoleGroupReleation> findAllByUserId(Integer userId);

    List<RoleGroupReleation> findAllByGroupId(Integer groupId);
}
