package com.hand.authorized.impl;

import com.hand.authorized.domain.User;
import com.hand.authorized.service.UserService;
import com.hand.authorized.utils.CommonUtils;
import com.hand.hap.cloud.mybatis.service.BaseService;
import com.hand.hap.cloud.mybatis.service.BaseServiceImpl;
import org.springframework.stereotype.Service;


/**
 * @Desription
 * @auther shaoming.lv
 * @create 2019-04-02-2:54 PM
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Override
    public User getUserByUserName(String userName) {
        User user = null;
        try {
            user = this.selectOne(new User().setUserName(userName).setEnabled(true));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User create(User user) {
        CommonUtils.checkoutUnique(this, new User().setUserName(user.getUserName()), "create user error, the userName");
        this.insert(user);
        return user;
    }
}
