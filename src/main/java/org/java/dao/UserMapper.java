package org.java.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author:
 * @Date: 2019/7/27 15:00
 * @Description:
 */
public interface UserMapper {
      public List<Map> login(@Param("username") String username);

public List<Map> loadMenus(int userId);

   public List<String> loadPermission(int userId);
}
