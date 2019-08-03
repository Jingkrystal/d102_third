package org.java.service;

import java.util.List;
import java.util.Map;

/**
 * @Author:
 * @Date: 2019/7/27 15:05
 * @Description:
 */
public interface UserService {
    public Map login(String username);

    public List<Map> loadMenus(int userId);

    public List<String> loadPermission(int userId);
}
