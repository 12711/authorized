package com.hand.authorized.utils;

import com.hand.authorized.exception.DomainUniqueException;
import com.hand.hap.cloud.mybatis.service.BaseService;
import org.springframework.util.CollectionUtils;

/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-03-1:59 PM
 */
public class CommonUtils {

    public static<T> void checkoutUnique(BaseService<T> baseService,T t,String message){
        if(!CollectionUtils.isEmpty(baseService.select(t))){
            throw new DomainUniqueException(message + "is exist");
        }
    }
}
