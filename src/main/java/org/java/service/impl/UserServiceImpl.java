package org.java.service.impl;

import org.java.dao.UserMapper;
import org.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author:
 * @Date: 2019/7/27 15:08
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Map login(String username) {

        List<Map> list = userMapper.login(username);

        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }


    }

    @Override
    public List<Map> loadMenus(int userId) {
        return userMapper.loadMenus(userId);
    }

    @Override
    public List<String> loadPermission(int userId) {
        return userMapper.loadPermission(userId);
    }

}
